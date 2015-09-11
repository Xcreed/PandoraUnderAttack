package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import controller.Clan;
import controller.Client;

/**
 * Read and writes a json file
 * this file will keep the stats from relics, clans and clients.
 * 
 * @author Juan Pablo
 *
 */
public class Json {
	
	
	private File file=new File("res/stats.json");
	private String id;
	private String pw;
	private long rank;
	private long importance;
	private String location;
	private boolean creator;
	private Clan clan;
	private String relicLocation;

	private DoubleLinkedList clientsList = new DoubleLinkedList();
	private String clanName;
	private DoubleLinkedList clansList = new DoubleLinkedList();
	private JSONParser parser = new JSONParser();
	
	/**
	 * Constructor for a new user
	 * @param id		User's id
	 * @param pw		User's password
	 * @param rank 		Rank the user is at the moment
	 * @param importance	The decision's importance while doing something
	 */
	public Json(String id, String pw, int rank, int importance) {
		this.pw = pw;
		this.id = id;
		this.rank = rank;
		this.importance = importance;
		
	}
	
	/**
	 * To instanciate the class with no parameters
	 */
	public Json() {
	}

	/**
	 * Writes the information in the json file
	 */
	@SuppressWarnings("unchecked")
	public void write() {
		
		InputStream inStream = null;
		OutputStream outStream = null;
		
		JSONObject clientObj = new JSONObject();
		clientObj.put("id", id);
		clientObj.put("pw", pw);
		clientObj.put("rank", rank);
		clientObj.put("importance", importance);
		clientObj.put("location", location);
		clientObj.put("creator", false);
		clientObj.put("clan", clanName);

		try {
					
			//Create a temp file
			File tmp = File.createTempFile("stats",".tmp");
			
			//Reads the file
			//Object obj = null;
			Object temp = null; //Temp Json file
			try {
				//obj = parser.parse(new FileReader(file));
				
				System.out.println("Temp file : " + tmp.getAbsolutePath());
	    		
				
				//Copy all the information from the original to the temp file
	    	    inStream = new FileInputStream(file);
	    	    outStream = new FileOutputStream(tmp);
	        	
	    	    byte[] buffer = new byte[1024];
	    		
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	    	  
	    	    	outStream.write(buffer, 0, length);
	    	 
	    	    }
	    	 
	    	    inStream.close();
	    	    outStream.close();
	    	    
	    	    //Reads the temp file, now with information inside
	    	    temp = parser.parse(new FileReader(tmp));
	    	    
	    	    System.out.println("File is copied successful!");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			//Prepare to write on a blank file
    	    FileWriter fileWriter = new FileWriter(file);//True = append
    	    
			//Takes the information from the file
			JSONObject jsonObject = (JSONObject) temp;
			 
			//Each clan in the file <This is an array>
			JSONArray clan = (JSONArray) jsonObject.get("clans");
			/**iteratorClan.next() = relics**/
			   
			//List of clients of the clan
			JSONObject clients = (JSONObject) clan.get(0);
			JSONArray clientsArray = (JSONArray) clients.get("clients");
			
			//Adds a new client to the array
			clientsArray.add(clientObj);
			System.out.print(clientObj);
			
			//Rewrites all the information with the new client
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		
		}

}
	
	/**
	 * Read information from the json file
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void read() {

	  try {

	   Object obj = parser.parse(new FileReader(file));
	   JSONObject jsonObject = (JSONObject) obj;
	   
	   //Each clan in the file <This is an array>
	   JSONArray clan = (JSONArray) jsonObject.get("clans");
	   /**iteratorClan.next() = relics**/
	   
	   //List of clients of the clan
	   JSONObject clients = (JSONObject) clan.get(0);
	   JSONArray clientsArray = (JSONArray) clients.get("clients");
	   //List of relics of the clan
	   JSONObject relics = (JSONObject) clan.get(1);
	   JSONArray relicsArray = (JSONArray) relics.get("relics");
	   
	   
	   //Gets the stats from the clients 
	   for (int i = 0; i < clientsArray.size(); i++) {
		   
		   JSONObject client = (JSONObject) clientsArray.get(i);
		   //ID of the client
		   id = (String) client.get("id");
		   System.out.println("Username: "+ id);
		   //Rank of the client
		   rank = (long) client.get("rank");
		   System.out.println("Rank: " + rank);
		   //Importance of the user
		   importance = (long) client.get("importance");
		   System.out.println("Importance: " + importance);
		   //Location of each user
		   location = (String) client.get("location");
		   System.out.println("Location: " + location);
		   //If the user is creator or not
		   creator = (boolean) client.get("creator");
		   System.out.println("Creator: " + creator);
		   //Which clan is the user from
		   String member = (String) client.get("clan");
		   System.out.println("Is member from the clan: " + member);
		   
		   //Creates a new client when the file is read.
		   //Client gameMember = new Client(id, pw, rank, importance, location, member);
		   
		   //client.
	   }
	   
	   for (int i = 0; i < relicsArray.size(); i++) {
		   
		   JSONObject relic = (JSONObject) relicsArray.get(i);
		   //Location of the relic.
		   relicLocation = (String) relic.get("location");
		   System.out.println("Relic is located at: " + relicLocation);
	   }

	   System.out.println("Done reading file");

	  } catch (FileNotFoundException e) {
	   e.printStackTrace();
	  } catch (IOException e) {
	   e.printStackTrace();
	  } catch (ParseException e) {
	   e.printStackTrace();
	  }

	 }

}
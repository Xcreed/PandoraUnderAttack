package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import controller.Clan;

/**
 * Read and writes a json file
 * this file will keep the stats from relics, clans and clients
 * @author Xcreed
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
	private String relicClan;
	
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
	 * Writes the information in the json file
	 */
	@SuppressWarnings("unchecked")
	public void write() {
		
		JSONObject countryObj = new JSONObject();
		countryObj.put("id", id);
		countryObj.put("pw", pw);
		countryObj.put("rank", rank);
		countryObj.put("importance", importance);
		countryObj.put("location", "");
		countryObj.put("creator", false);
		countryObj.put("clan", "");

		try {
			FileWriter fileWriter = new FileWriter(file, false);//Change to true to keep writing
			
			System.out.print(countryObj);
			
			fileWriter.write("\n"+countryObj.toJSONString());
			fileWriter.flush();
			fileWriter.close();
			this.read();

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
	   }
	   
	   for (int i = 0; i < relicsArray.size(); i++) {
		   
		   JSONObject relic = (JSONObject) relicsArray.get(i);
		   //Location of the relic
		   relicLocation = (String) relic.get("location");
		   System.out.println("Relic is located at: " + relicLocation);
		   //Clan that has the relic
		   relicClan = (String) relic.get("clan");
		   System.out.println("Relic belongs to the clan: " + relicClan);
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
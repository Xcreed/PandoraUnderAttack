package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import controller.Clan;

import org.json.simple.JSONObject;

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
	private int rank;//Not defined
	private int importance;//Not defined exactly
	private Clan clan;
	
	private JSONParser parser = new JSONParser();
	
	public Json(String id, String pw, int rank, int importance) {
		this.pw = pw;
		this.id = id;
		this.rank = rank;
		this.importance = importance;
	}
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

	public void read() {

	  try {

	   Object obj = parser.parse(new FileReader(file));

	   JSONObject jsonObject = (JSONObject) obj;

	   String id = (String) jsonObject.get("id");
	   long rank = (long) jsonObject.get("rank");
	   long importance = (long) jsonObject.get("importance");
//	   String location = (String) jsonObject.get("location");
//	   //boolean creator = (boolean) jsonObject.get("creator");
//	   String clan = (String) jsonObject.get("clan");
	   
	   System.out.println("Username: "+ id);
	   System.out.println("Password: ******");
	   System.out.println("Rank: " + rank);
	   System.out.println("Importance: " + importance);
	   System.out.println("Done");

	  } catch (FileNotFoundException e) {
	   e.printStackTrace();
	  } catch (IOException e) {
	   e.printStackTrace();
	  } catch (ParseException e) {
	   e.printStackTrace();
	  }

	 }

}
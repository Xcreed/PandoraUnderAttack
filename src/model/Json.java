package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * @Author : Arpit Mandliya
 */
public class Json {
	
	private File file=new File("res/stats.json");
	
	@SuppressWarnings("unchecked")
	public void write() {
		
		
		JSONObject countryObj = new JSONObject();
		countryObj.put("Name", "India");
		countryObj.put("Population", new Integer(1000000));

		JSONArray listOfStates = new JSONArray();
		listOfStates.add("Madhya Pradesh");
		listOfStates.add("Maharastra");
		listOfStates.add("Rajasthan");

		countryObj.put("States", listOfStates);

		try {
			file.canRead();
			FileWriter fileWriter = new FileWriter(file);
			System.out.println("Writing JSON object to file");
			System.out.println("-----------------------");
			System.out.print(countryObj);

			fileWriter.write(countryObj.toJSONString());
			//
			fileWriter.flush();
			fileWriter.close();
			this.read();

		} catch (IOException e) {
			e.printStackTrace();
		
		}

}

	public void read() {

	  JSONParser parser = new JSONParser();

	  try {

	   Object obj = parser.parse(new FileReader(file));

	   JSONObject jsonObject = (JSONObject) obj;

	   String nameOfCountry = (String) jsonObject.get("Name");
	   System.out.println("Name Of Country: "+nameOfCountry);

	   long population = (Long) jsonObject.get("Population");
	   System.out.println("Population: "+population);

	   System.out.println("States are :");
	   JSONArray listOfStates = (JSONArray) jsonObject.get("States");
	   Iterator<String> iterator = listOfStates.iterator();
	   while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	   }

	  } catch (FileNotFoundException e) {
	   e.printStackTrace();
	  } catch (IOException e) {
	   e.printStackTrace();
	  } catch (ParseException e) {
	   e.printStackTrace();
	  }

	 }

}
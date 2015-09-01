package view;

import controller.Client;
import model.Json;

public class Main {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	
		//Client jp = new Client();
		Json json = new Json("jp","..",0,1);
		json.read();
	}
}

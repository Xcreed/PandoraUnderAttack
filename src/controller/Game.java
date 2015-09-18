package controller;

import java.sql.Time;
import java.util.Scanner;

import model.DoubleLinkedList;
import model.Json;

public class Game {
	
	public Time time; //To manage the days in-game
	private static Json json = new Json();
	private Scanner scanner = new Scanner(System.in);
	private static DoubleLinkedList clans = json.getClans();//Has the objects of the clans
	private static DoubleLinkedList clients = json.clientsInTotal;
	private static DoubleLinkedList clientsReg = json.getClients();
	private static Client client = new Client();
	
	@SuppressWarnings("unchecked")
	public void login(String user){
		
		int userPos = 0; //Position where the user will be in the list
		if (checkUser(user)) {
			System.out.println("Play");
			///String clientName = null
			for (int i = 0; i < clients.getLength(); i++){ //Searchs for the position of the user
				Client searching = (Client) clients.getItem(i);
				System.out.println("Searching: " + user + " ID " + searching.getID());
				if (searching.getID().equals(user)){
					
					userPos = i;
					System.out.println(userPos);
				}
			}
			
			client = (Client) clients.getItem(userPos);//Gets the desired client
			System.out.println(client);
			//joinClan();
		} else { //User not created yet
			System.out.println("client not found");
			
			//json.write(user, 0, 0, null); //Taking the // writes a new client but missing to select clan
			
			//clients = json.clientsInTotal;
			//En ese m[etodo del json hay un clanName, ese es a donde va a ir el nuevo cliente
		}
		
	}
	
	public void start() {
		
	}
	
	public void joinClan() {
		
		int clanPos = 0;//Position of the clan
		for (int i = 0; i < clans.getLength(); i++){ //Get the id's of the clans created
			Clan clan = (Clan) clans.getItem(i);
			System.out.println(clan.id);
		}
		
		System.out.println("Choose a clan:");
		String clanName = scanner.nextLine();//Gets info from terminal entered from the user
		for (int i = 0; i < clans.getLength(); i++){
			Clan clan = (Clan) clans.getItem(i);
			if (clan.id.equals(clanName)){
				clanPos = i;
			}
		}
		Clan clanToJoin = (Clan) clans.getItem(clanPos); //Gets the desired clan
		client.joinClan(clanToJoin); //Adds the client to the clan
	}
	
	//When you close the game, the stats will be saved
	public void close() {
		
	}
	
	@SuppressWarnings("rawtypes")
	public boolean checkUser(String user) {
		if (clientsReg.contains(user)){//clientsReg only contains the id's of the clients
			return true;
		} else {
			return false;
		}
	}
	
	public void checkClan(String clanName) {
		boolean bool = json.checkClans(clanName);//Checks the ID of the clans
		
		if (bool) {
			System.out.println("play");
		} else {
			System.out.println("Clan not created");
		}
	}
}

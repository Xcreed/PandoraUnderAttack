package controller;

import java.util.Scanner;

import model.IPAddress;
import model.Json;
/**
 * A client will be used from a smartphone to control
 * all the functions to contribute to a clan
 * @author Xcreed
 *
 */
public class Client {
	
	private Resources resources = new Resources();
	private String password;
	private String id;
	private IPAddress ip;
	private Server server;//Not sure
	private long rank;//Not defined
	private long importance;//Not defined exactly
	private ChatRoom chatRoom;//Not sure
	//Lets just have one clan per client
	private String clan; //Using clan id
	private String location; //String meanwhile
	private boolean enableForBattle = true;
	private Json json = new Json();
	
	/**
	 * Works for a new player to be created
	 */
	public Client() {
		//Loads stats from json
		//Checks if the user has been saved
		//If not, takes the user to create a new one
		/*loadStats();
		if (saved) {
			game.load();
		} else { 
			newPlayer();
		}*/
		newPlayer();
	}
	
	/**
	 * Loads stats from an already created user
	 * @param id
	 * @param pw
	 * @param rank
	 * @param importance
	 * @param location
	 */
	public Client(String id, String pw, long rank, long importance, String location,
			String clan) {
		this.id = id;
		this.password = pw;
		this.rank = rank;
		this.location = location;
		this.importance = importance;
		this.clan = clan;
		checkClan(clan);
	}
	
	/**
	 * Checks if the client is inside the clan
	 * If not, will ask to join
	 * @param clan
	 */
	private void checkClan(String clan) {
		if (Clan.clients.search(id)) {
			//Is inside the clan, able to play
		} else {
			System.out.println("You are not in this clan");
			joinClan();
		}
		
	}
	
	/**
	 * Adds client to the list of clients of the clan
	 * <<Adds id or full client instance?>>
	 */
	private void joinClan() {
		Clan.clients.add(this.id);
		
	}

	//Can be boolean
	private void checkPw() {
		
	}
	
	private void setPW(String pw) {
		
	}
	
	//Saves stats to file
	public void save() {
		
	}
	
	
	private void loadStats(){
		json.read();
	}
	
	private void newPlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a username:");
		id = scanner.nextLine();
		scanner.reset();
		System.out.println("Enter a password:");
		password = scanner.nextLine();
		Json json = new Json(id,password,0,1); //Missing clan, location and creator
		json.write();
//		System.out.println(this.id);
//		System.out.println(this.password);

//		if (clan.hasCreator()) {
//			return;
//		} else {
//			Creator creator = new Creator();
//		}
		
	}
}

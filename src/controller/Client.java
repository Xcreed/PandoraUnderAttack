package controller;

import java.util.Scanner;


import factory.Iron;
import factory.Powder;
import factory.Resources;
import factory.Wood;
import model.IPAddress;
import model.Json;
/**
 * A client will use a smartphone  to control
 * all the functions to contribute to a clan.
 * 
 * @author Juan Pablo
 *
 */
public class Client {

	
	private String password;
	private String id;
	private IPAddress ip;
	private String clanName;
	private ServerWrite server;//Not sure
	
	//************POR DEFINIR*****************//
	private long rank; //Not defined
	private long importance;//Not defined exactly
	//private ChatRoom chatRoom;//Not sure
	
	private Clan clan;
	//private List clans = new ArrayList<Clan>();
	
	private String location;
	
	private boolean enableForBattle = true;
	
	private Json json = new Json();
	
	/**
	 * Useful to create clients by terminal
	 * works for a new player to be create.
	 */
	public Client(String id) {
		System.out.println("Client ID: " + id);
	}
	
	/**
	 * Loads stats from an already created user
	 * @param id
	 * @param pw
	 * @param rank
	 * @param importance
	 * @param location
	 */
	public Client(String id, long rank, long importance, String location) {
		this.id = id;
		this.rank = rank;
		this.location = location;
		this.importance = importance;
		//this.clanName = clan.id;
//		this.clan = clan;
//		joinClan();
	}
	
	/**
	 * Empty constructor.
	 */
	public Client() {
	}

	/**
	 * Returns the clan from which this client
	 * is member.
	 * 
	 * @return clan.id
	 */
	public String getClan() {
		return clan.id;
	}
	
	/**
	 * Checks if the client is inside the clan
	 * If not, will ask to join.
	 * @param clan
	 */
	private void checkClan(String clan) {	
	}
	
	/**
	 * Adds client to the list of clients of the clan
	 * <<Adds id or full client instance?>>
	 */
	@SuppressWarnings("unchecked")
	public void joinClan(Clan clan) { 
		this.clan = clan;
		this.clanName = clan.id;
		clan.receiveMember(this); //Adds the instance of the user to the list clients registered
		//Not adding to the clan automatically
	}

	//Can be boolean
	private void checkPw() {
		
	}
	
	private void setPW(String pw) {
		
	}
	
	//Saves stats to file
	public void save() {
		
	}
	
	/**
	 * Reads the JSON file and loads it. 
	 */
	private void loadStats(){
		json.read();
	}
	
	/**
	 * Puts a new player (client) in the game.
	 */
	private void newPlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a username:");
		id = scanner.nextLine();

//		if (clan.hasCreator()) {
//			return;
//		} else {
//			Creator creator = new Creator();
//		}
		
	}
	
	/**
	 * Returns the id of user.
	 * 
	 * @return id
	 */
	public String getID() {
		return id;
	}
}

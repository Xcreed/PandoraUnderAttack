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
	private int rank;//Not defined
	private int importance;//Not defined exactly
	private ChatRoom chatRoom;//Not sure
	//Lets just have one clan per client
	private Clan clan; //**************************
	//private GPS location;
	private boolean enableForBattle = true;
	
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
	
	//Can be boolean
	private void checkPw() {
		
	}
	
	public void joinClan(Clan desiredClan) {
		
	}
	
	private void setPW(String pw) {
		
	}
	
	//Saves stats to file
	public void save() {
		
	}
	
	
	private void loadStats(){
		
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

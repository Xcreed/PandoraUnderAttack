package controller;

import model.IPAddress;
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
	//private List clans = new ArrayList<Clan>(); //**************************
	private GPS location;
	private boolean enableForBattle = true;
	
	public Client() {
		loadStats();
		if (saved) {
			game.load();
		} else { 
			
		}
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
	

}

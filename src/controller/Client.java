package controller;

import model.IPAddress;

public class Client {
	
	private Resources resources = new Resources();
	private String password;
	private String id;
	private IPAddress ip;
	private Server server;//Not sure
	private int rank;//Not defined
	private double importance;//Not defined exactly
	private ChatRoom chatRoom;//Not sure
	private List clans = new ArrayList<Clan>();
	private GPS location;
	private boolean enableForBattle = true;
	
	public Client() {
		
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
	
	
	
	

}

package controller;

import java.util.List;

import model.DoubleLinkedList;

/**Clans will fight each others for relics, each clan
 * will have different clients, resources, guns and defenses
 * 
 * @author Xcreed
 *
 */
public class Clan implements Observer{
	
	public String id;
	/**
	 * Each clan will have a creator
	 */
	private Creator creator;
	/**
	 * Clan's most valuable object 
	 */
	private Relic relic;
	/**
	 * Each clan will have more than 1 client
	 */
	//private List clients;
	//private Image emblem;
	/**
	 * The clans will have resources
	 */
	private Resources resources;
	@SuppressWarnings("rawtypes")
	private DoubleLinkedList clients = new DoubleLinkedList();//List of clients the clan will have
	
	public Clan() {
		
	}
	public Clan(String id) {
		this.id = id;
		
	}
	
	public void attackClan(Clan targetClan) {
		
	}
	
	public void receiveMsg(String msg) {
		
	}
	
	public void update() {
		
	}
	
	/**
	 * Returns the list of clients inside the clan
	 * @return other classes will have access to the list
	 */
	@SuppressWarnings("rawtypes")
	public DoubleLinkedList getClients() {
		return clients;
	}
	
	public boolean hasCreator() {
		if (creator != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getClient(int i) {
		String tmp = (String) clients.getItem(i).getData();
		return tmp;
	}
	
	//Working separately from the client
	@SuppressWarnings("unchecked")
	public void receiveMember(String id) {
		clients.insertAtEnd(id);
		clients.print();
		//System.out.println("New client" + id);
	}

}

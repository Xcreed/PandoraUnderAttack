package controller;

import factory.*;
import model.DoubleLinkedList;

/**Clans will fight each others for relics, each clan
 * will have different clients, resources, guns and defenses
 * 
 * @author Juan Pablo
 *
 */
public class Clan implements Observer{
	
	public String id; //the id of the clan;
	private Creator creator; // each clan will have a creator;
	private Relic relic; //clan's most valuable object;
	//private Image emblem; //clan's image
	
	public Wood woodClan = new Wood(); //clan's wood resource (object instantiated);
	public Iron ironClan = new Iron(); //clan's iron resource (object instantiated);
	public Powder powderClan = new Powder(); //clan's powder resources (object instantiated);
	
	public GunFactory gunFactory = new GunFactory(); //factory for making guns ((object instantiated);
	public Guns pistol = null; // new gun ((object instantiated);
	public Guns sword = null; // new gun ((object instantiated);
	public Guns cannon = null; // new gun ((object instantiated);
	
	private DoubleLinkedList clients = new DoubleLinkedList(); //list of clients the clan will have;
	
	
	@SuppressWarnings("rawtypes")
	/**
	 * Default declare constructor.
	 */
	public Clan() {
	}
	
	/**
	 * Second constructor: set the id of the clan.
	 *  
	 * @param id
	 */
	public Clan(String id) {
		this.id = id;
	}
	
	/**
	 * Action 1.
	 * Attack an enemy clan.
	 * 
	 * @param targetClan
	 */
	public void attackClan(Clan targetClan) {
		//pandoraUnderAttack();
	}
	
	/**
	 * Sets an random amount of wood to the account.
	 */
	public void addWood(){
		woodClan.setRandomAmount();
	}
	
	/**
	 * Sets an random amount of iron to the account.
	 */
	public void addIron(){
		ironClan.setRandomAmount();
	}
	
	/**
	 * Sets an random amount of powder to the account.
	 */
	public void addPowder(){
		powderClan.setRandomAmount();
	}
	
	/**
	 * Shows the clan's general account of all resources collected. 
	 */
	public void showResources(){
		int totalWood = woodClan.getAmount();
		int totalIron = ironClan.getAmount();
		int totalPowder = powderClan.getAmount();
		
		System.out.println(totalWood);
		System.out.println(totalIron);
	}
	/**
	 * Buys and creates a sword.
	 */
	public void buySword(){
		if (clients.getLength() >= 1 & woodClan.getAmount() >= 1 & ironClan.getAmount() >= 2 ){
			woodClan.amountSubtraction(1);
			ironClan.amountSubtraction(2);
			sword = gunFactory.makeGun("S");
			System.out.println("excalibur");
		}
	}
	
	/**
	 * Buys and creates a pistol.
	 */
	public void buyPistol(){
		if (clients.getLength() >= 1 & powderClan.getAmount() >= 2 & ironClan.getAmount() >= 3 ){
			powderClan.amountSubtraction(2);
			ironClan.amountSubtraction(3);
			pistol = gunFactory.makeGun("P");
			System.out.println("45. magnum");
		}
	}
	
	/**
	 * Buys and creates a cannon.
	 */
	public void buyCannon(){
		if (clients.getLength() >= 1 & powderClan.getAmount() >= 3 & ironClan.getAmount() >= 3 & woodClan.getAmount() >= 2 ){
			powderClan.amountSubtraction(3);
			ironClan.amountSubtraction(3);
			woodClan.amountSubtraction(2);
			cannon = gunFactory.makeGun("C");
			System.out.println("Great Bomb");
		}
	}
	
	/**
	 * Returns a boolean whether the clan has a creator or not. 
	 * 
	 * @return boolean
	 */
	public boolean hasCreator() {
		if (creator != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Returns as a string a client inside the list 
	 * of the memebers of a clan. 
	 * 
	 * @param i
	 * @return client
	 */
	public String getClient(int i) {
		String tmp = (String) clients.getItem(i).getData();
		return tmp;
	}
	
	/**
	 * Returns the list of clients inside the clan
	 *  other classes will have access to the list.
	 *  
	 * @return clients
	 */
	@SuppressWarnings("rawtypes")
	public DoubleLinkedList getClients() {
		return clients;
	}
	
	
	//Working separately from the client
	@SuppressWarnings("unchecked")
	public void receiveMember(String id) {
		clients.insertAtEnd(id);
		clients.print();
		//System.out.println("New client" + id);
	}
	
	
	public void receiveMsg(String msg) {
	}
	
	public void update() {
	}

}

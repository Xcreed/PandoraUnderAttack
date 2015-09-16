package controller;

import factory.*;
import factory.Defense;
import model.DoubleLinkedList;

/**
 * Clans will fight each others for relics, each clan
 * will have different clients, resources, guns and defenses
 * 
 * @authors Juan Pablo and Randy
 *
 */
public class Clan implements Observer{
	
	public String id; //the id of the clan;
	private Creator creator; // each clan will have a creator;
	
	private int damageClan;
	private int resistanceClan;
	
	//private Image emblem; //clan's image
	
	
	public Wood woodClan = new Wood(); //clan's wood resource (object instantiated);
	public Iron ironClan = new Iron(); //clan's iron resource (object instantiated);
	public Powder powderClan = new Powder(); //clan's powder resources (object instantiated);
	
	public GunFactory gunFactory = new GunFactory(); //factory for making guns ((object instantiated);
	public Guns pistol = null; // new gun ((object instantiated);
	public Guns sword = null; // new gun ((object instantiated);
	public Guns cannon = null; // new gun ((object instantiated);
	
	public DefenseFactory defenseFactory = new DefenseFactory(); //factory for making defenses((object instantiated);
	public Defense spartanshields = null; //new defense ((object instantiated);
	public Defense kevlarshields = null; //new defense ((object instantited);
	public Defense lasershields = null; //new defense ((object instantited);
	
	public DoubleLinkedList clients = new DoubleLinkedList(); //clan's list of the clients (members);
	public DoubleLinkedList relics = new DoubleLinkedList(); //clan's most valuable objects(relics);
	public DoubleLinkedList weapons = new DoubleLinkedList(); //clan's list for the weapons;
	public DoubleLinkedList defenses = new DoubleLinkedList(); //Clan's list for defenses;
	
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
	 * Returns the value of the damageClan attribute.
	 * 
	 * @return damageClan
	 */
	public int getDamageClan(){
		return damageClan;	
	}
	
	/**
	 * Return the value of the resistanceClan attribute.
	 * 
	 * @return resistanceClan
	 */
	public int getResistanceClan(){
		return resistanceClan;
	}
	
	/**
	 * Compare the damage level of the attacking clan against the resistance level 
	 * of the target clan, if bigger attack the clan, if equal a time is given to wait 
	 * for members, else there's no attack.
	 * 
	 * @param targetClan
	 */
	public void PandoraUnderAttack(Clan targetClan){
		
		LocalTime time = LocalTime.now();
		time.plusSeconds(20);
		Clan attackingClan = this;
		
		//If members are correct, 20 seconds a given to wait, then attack.
		if(attackingClan.getDamageClan() > targetClan.getResistanceClan()){
			while(LocalTime.now() != time){
			}
			attackClan(attackingClan,targetClan);
		
			//If member are incorrect,
		}else if (attackingClan.getDamageClan() == targetClan.getResistanceClan()){
			while(LocalTime.now() != time.plusSeconds(20)){
				if(attackingClan.clients.getLength() > targetClan.clients.getLength()){
					attackClan(attackingClan,targetClan);	
				}else{
					
				}
			}
		}else{
			System.out.println("Retreat");
		}
	}
	
	/**
	 * Action 1: Pandora Under Attack
	 * Attack an enemy clan.
	 * 
	 * @param targetClan
	 */
	public void attackClan(Clan attackingClan, Clan targetClan) {
		
		//Same amount of clients from each clan.
		if (attackingClan.clients.getLength() == targetClan.clients.getLength()) {
			System.out.println("Same amount");
		}
		//Attacking clan has less clients which results in losing the fight.
		else if (attackingClan.clients.getLength() < targetClan.clients.getLength()) {
			System.out.println("Lossing");
			attackingClan.removeRelic(targetClan);
		} 
		//Attacking clan has the advantage and wins the relic.
		else {
			System.out.println("Winning");
			targetClan.removeRelic(attackingClan);
		}
	}
	
	/**
	 * Sets an random amount of wood to the account.
	 */
	public void addWoodRandom(){
		woodClan.setRandomAmount();
	}
	
	/**
	 * Sets an random amount of iron to the account.
	 */
	public void addIronRandom(){
		ironClan.setRandomAmount();
	}
	
	/**
	 * Sets an random amount of powder to the account.
	 */
	public void addPowderRandom(){
		powderClan.setRandomAmount();
	}
	
	/**
	 * Adds an amount of wood.
	 * 
	 * @param amount
	 */
	public void addWood(int amount){
		woodClan.amountAdding(amount);
	}
	
	
	/**
	 * Adds an amount of iron.
	 * 
	 * @param amount
	 */
	public void addIron(int amount){
		ironClan.amountAdding(amount);
	}
	
	/**
	 * Adds an amount of powder
	 * @param amount
	 */
	public void addPowder(int amount){
		powderClan.amountAdding(amount);
	}
	
	
	/**
	 * Shows the clan's general account of all resources collected. 
	 */
	public void showResources(){
		int totalWood = woodClan.getAmount();
		int totalIron = ironClan.getAmount();
		int totalPowder = powderClan.getAmount();
		
		System.out.println("Wood: " + totalWood);
		System.out.println("Iron: " + totalIron);
		System.out.println("Powder: " + totalPowder);
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
			weapons.insertAtEnd(sword);
			damageClan += sword.getDamage();
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
			weapons.insertAtEnd(pistol);
			damageClan += pistol.getDamage();
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
			weapons.insertAtEnd(cannon);
			damageClan += cannon.getDamage();
		}
	}
	
	/**
	 * Buys and creates a kevlar shield.
	 */
	public void buyKevlarShields(){
		if (clients.getLength() >= 1 & ironClan.getAmount() > 2 & powderClan.getAmount() > 1 ){
			ironClan.amountSubtraction(2);
			powderClan.amountSubtraction(1);
			kevlarshields = defenseFactory.makeDefense("KS");
			System.out.println("KEVLAR PROTECTION");
			defenses.insertAtEnd(kevlarshields);
			resistanceClan += kevlarshields.getResistance();
		}
	}
	
	/**
	 * Buys and creates a spartan shield.
	 */
	public void buySpartanShields(){
		if (clients.getLength() >= 1 & ironClan.getAmount() > 2 & woodClan.getAmount() > 1 ){
			ironClan.amountSubtraction(2);
			woodClan.amountSubtraction(1);
			spartanshields = defenseFactory.makeDefense("SS");
			System.out.println("DEFEND SPARTA");
			defenses.insertAtEnd(spartanshields);
			resistanceClan += spartanshields.getResistance();
		}
	}
	
	/**
	 * Buys and creates a laser shield.
	 */
	public void buyLaserShields(){
		if (clients.getLength() >= 1 & ironClan.getAmount() > 2 & woodClan.getAmount() > 2 & powderClan.getAmount() > 2 ){
			ironClan.amountSubtraction(2);
			woodClan.amountSubtraction(2);
			powderClan.amountSubtraction(2);
			lasershields = defenseFactory.makeDefense("LS");
			System.out.println("LASER SHIELDS");
			defenses.insertAtEnd(lasershields);
			resistanceClan += lasershields.getResistance();
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
		}else {
			return false;
		}
	}
	
	/**
	 * Returns as a string a client inside the list 
	 * of the members of a clan. 
	 * 
	 * @param i
	 * @return client
	 */
	public String getClient(int i) {
		if(i < clients.getLength()){
			String tmp = (String) clients.getItem(i).getData();
			return tmp;
		}else{
			return null;
		}
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
	public void receiveMember(Client client) {
		clients.insertAtEnd(client);
		clients.print();
		//System.out.println("New client" + id);
	}
	
	/**
	 * Adds a new relic to a clan
	 * Missing adding location
	 */
	@SuppressWarnings({ "static-access", "unchecked" })
	public void addRelic() {
		
		Relic newRelic = new Relic();
		newRelic.makeRelic();
		relics.insertAtEnd(newRelic);
	}
	
	/** 
	 * Removes a relic from on clan, adds creates a new relic in
	 * the clan who won the fight.
	 * 
	 * @param newOwner
	 */
	public void removeRelic(Clan newOwner) {
		
		if (relics.getLength() == 0) {
			try {
				this.finalize();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		relics.removeAtEnd();
		newOwner.addRelic();
	}
	
	public void receiveMsg(String msg) {
	}
	
	public void update() {
	}
}

package controller;

/**Clans will fight each others for relics, each clan
 * will have different clients, resources, guns and defenses
 * 
 * @author Xcreed
 *
 */
public class Clan implements Observer{
	
	
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
	private List clients;
	/**
	 * Creator will set an emblem for the clan
	 */
	private Image emblem;
	/**
	 * The clans will have resources
	 */
	private Resources resources;
	
	
	public Clan() {
		
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
	public List getClients() {
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

}

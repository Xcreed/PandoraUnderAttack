package factory;

public class Relic {
	
	private int position;
	private static Relic newRelic = null;
	
	/**
	 * Empty constructor
	 */
	public Relic(){
	}
	
	
	/**
	 * Makes relics for one clan.
	 * 
	 * @return relic
	 */
	public static Relic makeRelic(){
		
		if(newRelic == null){
			newRelic = new Relic();
		} else {
			return newRelic;
		}
		
		return newRelic;
	}

	
	public int getPosition() {
		return position;
	}

	
	public void setPosition(int position) {
		this.position = position;
	}
	

}
			

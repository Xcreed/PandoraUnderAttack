package factory;

public class Relic {
	
	private int position;
	private static Relic newRelic = null;
	
	/**
	 * Empty constructor
	 */
	private Relic(){
	}
	
	
	/**
	 * 
	 * @return relic
	 */
	public static Relic makeRelic(){
		
		if(newRelic == null){
			newRelic = new Relic();
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
			

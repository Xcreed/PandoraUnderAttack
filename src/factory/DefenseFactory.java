package factory;
/**
 * This class is the factory for the guns 
 * (all kinds).
 * 
 * @author Randy
 *
 */
public class DefenseFactory {
	
	private Defense newDefense;

	/**
	 * This method is a like a creator, constructor,
	 * factory of the defenses. Depending on the entry
	 * it makes one specified defense, only one at the time.
	 * 
	 * @param defenseType
	 * @return defense
	 */
	public Defense makeDefense(String defenseType){
		
		newDefense = null;
		
		if(defenseType.equals("SS")){
			return new SpartanShields();
		}else if (defenseType.equals("KV")){
			return new KevlarShields();
		}else if(defenseType.equals("LS")){
			return new LaserShields();
		}else{
			return null;
		}
	}
}

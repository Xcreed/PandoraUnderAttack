package factory;
/**
 * This class is the factory for the guns 
 * (all kinds).
 * 
 * @author Randy
 *
 */
public class GunFactory {
	
	private Guns newGun;

	/**
	 * This method is a like a creator, constructor,
	 * factory of the guns. Depending on the entry
	 * it makes one specified gun, only one at the time.
	 * 
	 * @param gunType
	 * @return gun
	 */
	public Guns makeGun(String gunType){
		
		newGun = null;
		
		if(gunType.equals("S")){
			return new Sword();
		}else if (gunType.equals("P")){
			return new Pistol();
		}else if(gunType.equals("C")){
			return new Cannon();
		}else{
			return null;
		}
		
	}

}

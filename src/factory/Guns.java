package factory;

/**
 * This class is an abstract model for the guns (weapons)
 * use by the clans to attack each other.
 * 
 * @author Randy
 *
 */
public abstract class Guns{

	private String name; 
	private int damage;
	//cost

	/**
	 * Returns the name of the gun.
	 * @return name
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set the name of the gun.
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * Returns the damage (gun) cause by the gun.
	 * @return damage
	 */
	public double getDamage() {
		return damage;
	}

	/**
	 * Set the new damage value.
	 */
	public void setDamage(int newDamage) {
		damage = newDamage;
	}
}

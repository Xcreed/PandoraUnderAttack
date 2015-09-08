package factory;
/**
 * The Defense abstract class is stands for the defense the clans
 * use for repel atacks from other clans. 
 * 
 * @author Randy
 *
 */
public class Defense {
	
	private String name;
	private int resistance;
	
	/**
	 * Returns the name of the cannon.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the cannon
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the resistance of defense. 
	 * 
	 * @return
	 */
	public int getResistance() {
		return resistance;
	}

	/**
	 * Set the resistance of the defense. 
	 * @param resistance
	 */
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	
	
}

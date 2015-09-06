package factory;

/**
 * Concrete class of the powder resource. Set attributes
 * to the object powder that will be related to each client
 * and a a general one to the clan the client belongs.
 * 
 * @author Randy
 *
 */

public class Powder extends Resources {

	/**
	 * Constructs powder and 
	 * set the attributes to it.
	 */
	public Powder(){
		
		setName("Powder");
		setAmount(0);
	}

}
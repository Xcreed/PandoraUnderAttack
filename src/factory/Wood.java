package factory;

/**
 * Concrete class of the wood resource. Set attributes
 * to the object wood that will be related to each client
 * and a a general one to the clan the client belongs.
 * 
 * @author Randy
 *
 */
public class Wood extends Resources {
	
	/**
	 * Constructs woods and 
	 * set the attributes to it.
	 */
	public Wood(){
		
		setName("Wood");
		setAmount(0);
	}

}
package factory;

/**
 * Concrete class of the iron resource. Set attributes
 * to the object iron that will be related to each client
 * and a a general one to the clan the client belongs.
 * 
 * @author Randy
 *
 */
public class Iron extends Resources {
	
	/**
	 * Constructs iron and 
	 * set the attributes to it.
	 */
	public Iron (){
		
		setName("Iron");
		setAmount(0);
	}


}

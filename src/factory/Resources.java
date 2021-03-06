package factory;

import java.util.Random;

/**
 * This class is an abstract model for the resources
 * use of need of each clan. The resources are:
 * 		wood;
 * 		powder;
 * 		meta;
 * 
 * @author Randy
 *
 */
public abstract class Resources {
	
	private String name;
	private int amount;
	
	/**
	 *Returns the name of the resource.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name of the resource.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the amount of resource for a specific
	 * need.
	 * 
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * Set an desired amount (add) to the resource. 
	 * 
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * Set a random amount to the resource.
	 * 
	 * @param
	 */
	public void setRandomAmount(){
		
		int min = 1;
		int max = 10;
		
		Random rand = new Random();
		int randAmount = rand.nextInt((max - min ) + 1 ) + min;
		this.amount = amount + randAmount;
	}
	
	/**
	 * Set an adding number for the amount and set a new value for the 
	 * amount. 
	 * 
	 * @param buying
	 */
	public void amountAdding(int add){
		this.amount = amount + add;	
	}

	/**
	 * Set a subtraction for the amount and set a new value for the 
	 * amount. 
	 * 
	 * @param buying
	 */
	public void amountSubtraction(int sub){
		this.amount = amount - sub;	
	}

}

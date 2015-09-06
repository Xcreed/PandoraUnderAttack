package model;
/**
 * Class for the simples nodes for 
 * 
 * @author Randy
 *
 * @param <T>: generic object
 */

public class SimpleNode<T extends Comparable<? super T>> {
	
	
	private SimpleNode<T> next; // basic node for next
	private T data; 			//data/element to be inserted
	
	
	
	//constructor
	public SimpleNode (T data) {
		this.data = data;
	}	
	
	//set the node for the next one
	public void setNext(SimpleNode<T> next) {
		this.next = next;
	}
	
	//get the next node of the list
	public SimpleNode<T> getNext() {
		return next;

	}


	//get the data of an node
	public Object getData() {
		return data;
	}
}
package model;
/**
 * Class for the LinkedList
 * 
 * @author Randy
 *
 * @param <T>
 */

public class SimpleNode<T extends Comparable<? super T>> {
	
	//Changed T for Object
	
	private SimpleNode<T> next;
	private T data;
	//private long size;
	
	
	public SimpleNode (T data) {
		this.data = data;
	}	
	
	public void setNext(SimpleNode<T> next) {
		this.next = next;
	}
	
	public SimpleNode<T> getNext() {
		return next;
	}
	
	public Object getData() {
		return data;
	}
}

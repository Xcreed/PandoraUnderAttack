package model;

public class SimpleNode<T extends Comparable<? super T>> {
	
	//Changed T for Object
	
	private SimpleNode<T> next;
	private T data;
	
	
	public void setNext(SimpleNode<T> next) {
		next = this.next;
	}
	
	public SimpleNode<T> getNext() {
		return next;
	}
	
	public Object getData() {
		return data;
	}
	
	public SimpleNode (T data) {
		data = this.data;
	}	

}

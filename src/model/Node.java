package model;

@SuppressWarnings("rawtypes")
public class Node<T> {
	
	//Add generics
	
	private Node next;
	private T data;
	
	
	public void setNext(Node next) {
		next = this.next;
		
	}
	
	public Node getNext() {
		return next;
		
	}
	
	public T getData() {
		return data;
	}
	
	public Node (T data) {
		data = this.data;
	}	

}

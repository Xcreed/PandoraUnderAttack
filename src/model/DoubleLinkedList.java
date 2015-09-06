package model;

/**
 * Class for doubly linked list, linear data structure for the game
 * @author Randy
 *
 * @param <T>
 */

public class DoubleLinkedList <T extends Comparable<? super T>> {
	
	private DoubleNode<T> head = null; //null node for the head of the list
	private DoubleNode<T> tail = null; //null node for the tail of the list
	
	
	/**
	 * Return the length of the list.
	 * 
	 * @return length (integer)
	 */
	public int getLength() {
		int counter = 0; 
		DoubleNode tmp = head;
		
		while (tmp != null) {
			counter++;
			tmp = tmp.getNext();
			}
		return counter;
		}
		
	/**
	 * Returns a true if empty, else false.
	 * 
	 * @return boolean 
	 */
	public boolean isEmpty(){
		if (head == null){  //optional: getLength() == 0
			return true;
		}else{
			return false;
			}
		}
	
	/**
	 * Insert an element (tData) at the beginning of the list.
	 * 
	 * @param pData
	 */
	public void insertAtBeginning(T tData){
		
		DoubleNode<T> data = new DoubleNode<T>(tData);
		
		if(isEmpty()){
			head = tail = data;
		}else{
			head.setPrev(data); //head.prev = data;
		}
		data.setNext(head); //data.next = head;
		head = data; //head = data;
	}
	
	/**
	 * Insert an element (tData) at the end of the list.
	 * 
	 * @param tData
	 */
	public void insertAtEnd(T tData){
		
		DoubleNode<T> data = new DoubleNode<T>(tData);
		
		if(isEmpty()){
			head = tail = data;
		}else{
			tail.setNext(data); //tail.next = data;
			data.setPrev(tail); //data.prev = tail;
		}
		tail = data; //tail = head;
	}
	
	/**
	 * Return a list (type StringBuilder) that shows all the node together.
	 * 
	 * @return list 
	 */
	public StringBuilder print(){	
		
		StringBuilder list = new StringBuilder();
		DoubleNode tmp = head;
		
		while(tmp != null){
			//System.out.println(list);
			list.append(tmp.getData() + ",");
			tmp = tmp.getNext();
		}
		System.out.println(list);
		return list;
	}
	
	public DoubleNode getItem(int i) {
		
		if (head == tail) {
			return head;
		}
		
		else  {
		
			DoubleNode temp = head;
			
			for (int j = 0; j != i; j++) {
				
				temp = head.getNext();
			}
			return temp;
		}
			
	}
	
	/**
	 * Return the search  element, else false.
	 * @param pData
	 * @return pData
	 */
	public boolean search(T pData){
		DoubleNode<T> data = new DoubleNode<T>(pData);
		boolean bool = false;
	
		if(isEmpty()){
			return bool;
		}else{
			DoubleNode tmp = head; 
			while(tmp != null){
				if(tmp.getData() == pData){
					bool = true;
					break;
				}else{
					tmp = tmp.getNext(); 
				} 
			}
			return bool;
		}
	}
	
	public void removeAtBeginning(){
		
		//List only has one element
		if (head == tail) {
			head = tail = null;
		} else {
	
		DoubleNode<T> tmp = head.getNext();
		
		head = head.getNext();
		head.setNext(tmp.getNext());
		head.setPrev(null);
		}
	}
	
	public void removeAtEnd() {
		//List only has one element
		if (head == tail) {
			head = tail = null;
		} else {
			tail = tail.getPrev();
			tail.setNext(null);			
		}
	}
	/**
	 * removeAtEnd()
	 * insertInPosition(int position, tdata)
	 * removeInPosition(int postion, tdata)
	 */

	

}

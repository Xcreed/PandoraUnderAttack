package model;


@SuppressWarnings({ "unchecked", "rawtypes" })
public class SimpleLinkedList<T extends Comparable<? super T>> {
	
	private SimpleNode _head = null;
	private SimpleNode _tail = null;
	
	public void insertBeginning(T pData) { //Insert at the beginning
		
		SimpleNode newNode = new SimpleNode(pData); //New element to be inserted 
		
		if (_head == null){
			_head = _tail = newNode;
		}else { //List already has at least one element
			newNode.setNext(_head);
			_head = newNode;		
			}
	}
	
	//insert an element at the last position of the complete node
	public void insertLast(T pData) {
		
		SimpleNode newNode = new SimpleNode(pData);
		
		if(_head == null){
			_head = _tail = newNode;
		}else{
			SimpleNode tmp = _head; //_tail
			while(tmp!= null){
				tmp = tmp.getNext();
			}
			//tmp.setNext(newNode);
			_tail = newNode;
			//newNode.setNext(null);
		}
	}
	
	//return the lenth of the complete node
	public int getLength() {
		
		int l = 0;
		SimpleNode tmp = _head;
		
		while (tmp != null) {
			l++;
			tmp = tmp.getNext();
		}
		return l;
	}
	
	
	//delete one node (element) 
	public void delete (int pData) {
		
		if (_head == null){
			return;
		}else if ((int)_head.getData() == pData) { //added (int) for usability
			_head = _head.getNext();
			return;
		}
		SimpleNode tmp = _head;
		
		while (tmp.getNext() != null & (int) tmp.getNext().getData() != pData) { //added (int) for usability
			tmp = tmp.getNext();					
			if (tmp.getNext() == null){
				return;
			}else if (tmp.getNext() == _tail) {
				_tail = tmp;
				_tail.setNext(null);
			}else{
				tmp.setNext(tmp.getNext());
			}
		}		
	}
	
	//print the complete node as a StringBuilder
	public void print(){	
		
		StringBuilder list = new StringBuilder();
		SimpleNode tmp = _head;
		
		while(tmp != null){
			System.out.println(list);
			//list.append(tmp.getData());
			tmp = tmp.getNext();
		}
		//return list;
	}
	
	public boolean search(T pData){
		
		boolean bool = false;
		if(getLength() == 0){
			return bool;
		}else{
			 SimpleNode tmp = _head; 
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
}

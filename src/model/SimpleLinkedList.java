package model;
/**
 * 
 * @author Randy
 *
 * @param <T>
 */

@SuppressWarnings({ "unchecked", "rawtypes" })
public class SimpleLinkedList<T extends Comparable<? super T>> {
	
	private SimpleNode _head = null;
	private SimpleNode _tail = null;
	
	//Insert at the beginning of the node
	public void insertBeginning(T pData) { 
		
		SimpleNode newNode = new SimpleNode(pData); //New element to be inserted 
		
		if (_head == null){
			_head = _tail = newNode;
<<<<<<< HEAD
		}else { //List already has at least one element
			newNode.setNext(_head);
			_head = newNode;		
			}
=======
		}else { 						//List already has at least one element
			SimpleNode tmp = _head;
			newNode.setNext(tmp);
			_head = newNode;
				
			}
			
			//newNode.setNext(_head);
			//_head = newNode;
			
/*****All of these is to try to insert in order*****/
//			if (_head.getData() == newNode.getData()) {
//				newNode.setNext(_head);
//				_head = newNode;
//			}
//			
//			else if (_tail.getData().equals(newNode.getData())) {
//				_tail.setNext(newNode);
//				_tail = newNode;
//			}

//			else {
//				
//				SimpleNode tmp = _head;
//				while(tmp.getNext().getData() < pData)
//					tmp = tmp.getNext();
//				newNode.setNext(tmp.getNext());
//				tmp.setNext(newNode);
//			}
	
		
		
>>>>>>> master
	}
	
	//Insert an element at the last position of the complete node
	public void insertLast(T pData) {
		
		SimpleNode newNode = new SimpleNode(pData); //New element to to inserted
		
		if(_head == null){
			_head = _tail = newNode;
		}else{
			SimpleNode tmp = _head;
			while(tmp!= null){
				tmp = tmp.getNext();
			}
			_tail.setNext(newNode);
			_tail = newNode;
			//newNode.setNext(null); 
			_tail.setNext(null);
		}
	}
	
	//return the length of the complete node
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
	public void delete (T pData) {
		
		if (getLength() == 0){
			return;
		}else if (_head.getData() == pData) {
			_head = _head.getNext();
			return;
		}else{
			SimpleNode tmp = _head;
			//SimpleNode tmp2 = _head;
			while (tmp != null & tmp.getData() != pData){
				tmp = tmp.getNext();
				if (tmp == null){
					return;
				}else if (tmp == _tail){
					_tail = tmp;
					_tail.setNext(null);
				}
				else{
					tmp.getNext();
				}
			}
		}			
	}
	
	
	//print the complete node as a StringBuilder
	public StringBuilder print(){	
		
		StringBuilder list = new StringBuilder();
		System.out.println("printing");
		SimpleNode tmp = _head;
		
<<<<<<< HEAD
		while(tmp != null){
			//System.out.println(list);
=======
		while(!(tmp.getNext() == null)){
			System.out.println(list + "ha");
>>>>>>> master
			list.append(tmp.getData());
			tmp = tmp.getNext();
		}
		System.out.println(list);
		return list;
	}
	
	//return boolean while looking a special element
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

package model;


@SuppressWarnings({ "unchecked", "rawtypes" })
public class SimpleLinkedList<T extends Comparable<? super T>> {
	
	private SimpleNode _head = null;
	private SimpleNode _tail = null;
	
	//Insert at the beginning
	public void insertBeginning(T pData) {
		
		SimpleNode newNode = new SimpleNode(pData);
		
		//List empty, assign head and tail to new node
		if (_head == null)
			_head = _tail = newNode;
		
		else { //List already has at least one element
			
			newNode.setNext(_head);
			_head = newNode;
			
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
		}
		
		
	}
	
	public void insertLast(T pData) {
		
		SimpleNode newNode = new SimpleNode(pData);
		
		_tail.setNext(newNode);
		newNode.setNext(null);
		_tail = newNode;
		
		//for (SimpleNode tmp = _head; !(tmp.getNext().getNext() == null); tmp = tmp.getNext());

	}
	
	public int getLength() {
		
		int l = 0;
		SimpleNode tmp = _head;
		
		while (tmp != null) {
			l++;
			tmp = tmp.getNext();
		}
		
		return l;
		
//		while (_head != _tail, )
	}
	
	
	public void delete (int pData) {
		
		if (_head == null)
			return;
		
		//added (int) for usability
		else if ((int)_head.getData() == pData) {
			_head = _head.getNext();
			return;
		}
		
		SimpleNode tmp = _head;
		
		//added (int) for usability
		while (tmp.getNext() != null & (int) tmp.getNext().getData() != pData) {
			tmp = tmp.getNext();
						
			if (tmp.getNext() == null) 
				return;
			
			else if (tmp.getNext() == _tail) {
				_tail = tmp;
				_tail.setNext(null);
			}
			
			else 
				tmp.setNext(tmp.getNext());
		}
			
	}
	
	public String print() {
		
		//Not working
		String list = "[";
		for (SimpleNode tmp = _head; !(tmp.getNext() == null); tmp = tmp.getNext()) {
			list = list + tmp.getData() + ", ";
		}
		
		list = list + " ]";
		return list;
	}

}

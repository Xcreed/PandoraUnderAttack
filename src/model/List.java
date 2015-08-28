package model;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class List {
	
	private Node _head = null;
	private Node _tail = null;
	
	public void insert(int pData) {
		
		
		Node newNode = new Node(pData);
		
		
		if (_head == null)
			_head = _tail = newNode;
		
		else {
			
			if (_head.getData() == newNode.getData()) {
				newNode.setNext(_head);
				_head = newNode;
		
			}
			
			else if (_tail.getData() < newNode.getData()) {
				_tail.setNext(newNode);
				_tail = newNode;
				
			}
			
			else {
				
				Node tmp = _head;
				while(tmp.getNext().getData() < pData)
					tmp = tmp.getNext();
				newNode.setNext(tmp.getNext());
				tmp.setNext(newNode);
			}
		}
		
		
	}
	
	public int getLength() {
		
		int l = 0;
		Node tmp = _head;
		
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
		
		Node tmp = _head;
		
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
	
	
}

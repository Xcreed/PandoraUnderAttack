package view;

import model.SimpleLinkedList;

public class Main {
	
	
	
	public static void main(String[] args) {
	
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.insertBeginning(1);
		list.insertBeginning(2);
		list.insertBeginning(3);
		list.insertBeginning(4);
		list.insertBeginning(5);
		
		System.out.println(list.print());
	}
	
	

}

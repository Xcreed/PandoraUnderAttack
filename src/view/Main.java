package view;

import model.SimpleLinkedList;

public class Main {
	
	
	
	public static void main(String[] args) {
	
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.insertBeginning(40);
		list.insertBeginning(41);
		list.insertBeginning(42);
		list.insertBeginning(43);
		list.insertBeginning(4);
		
		list.print();
		
		System.out.println(list.getLength());
		System.out.println("--------------------------------");
		//System.out.println(list.print());
		System.out.println("--------------------------------");
		System.out.println("prueba");
		
	}
	
	

}

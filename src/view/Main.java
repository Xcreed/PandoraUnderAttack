package view;

<<<<<<< HEAD
import java.util.Scanner;

import model.SimpleLinkedList;
=======
import controller.Client;
import model.Json;
>>>>>>> master

public class Main {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	
<<<<<<< HEAD
		Scanner sc = new Scanner(System.in);
		
		
		SimpleLinkedList <Integer> list = new SimpleLinkedList();
		
		list.insertBeginning(1);
		list.insertBeginning(2);
		list.insertBeginning(3);
		
		list.insertLast(99);
		list.insertLast(102);
		list.insertLast(789);
		
	
		
				
		System.out.println("El largo de la lista es: " + list.getLength());
		System.out.println("--------------------------------");
		System.out.println("Los elementos dentro de la lista son: ");
		System.out.println(list.print());
		System.out.println("--------------------------------");
		System.out.println("El elemento esta o no en la lista: "+ list.search(102));
		System.out.println("--------------------------------");
		System.out.println("Borrando elementos");
		System.out.println("--------------------------------");
		list.delete(102);
		System.out.println(list.print());
		
		
=======
		//Client jp = new Client();
		Json json = new Json("jp","..",0,1);
		json.read();
>>>>>>> master
	}
}

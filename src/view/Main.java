package view;

import java.util.Scanner;

import model.Json2;

public class Main {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Json2 json2 = new Json2();
		
		json2.write();
		System.out.println("done writing");
		json2.read();
		
	}
}

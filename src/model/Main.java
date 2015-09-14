package model;

public class Main {
	
	public static void main(String[] args) {
		Json json = new Json();
		json.read();
		System.out.println("HEY" + json.getClans().getLength());
	}
}

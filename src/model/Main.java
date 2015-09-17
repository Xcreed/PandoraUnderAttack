package model;

public class Main {
	
	public static void main(String[] args) {
		Json json = new Json();
		json.write(10,50,66);
		System.out.println("HEY" + json.getClans().getLength());
	}
}

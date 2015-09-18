package model;

import controller.Game;

public class Main {
	
	public static void main(String[] args) {
		Json json = new Json();
		//json.read();
//		DoubleLinkedList clans = json.getClans();
//		System.out.println("HEY" + clans.getLength());
//		Clan clan = (Clan)clans.getItem(2);
//		System.out.println(clan.id);
//		//json.write("S", 10, 20, null);
		//json.getClients();
		
		System.out.println("HOLY" + json.checkClans("A"));
		Game game = new Game();
		System.out.println("CHECK" + game.checkUser("JP3"));
		
		game.login("JP3");
		game.joinClan();
	}
}

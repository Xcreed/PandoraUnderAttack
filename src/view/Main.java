package view;

import controller.Clan;
import controller.Client;

public class Main {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args) {
		
		Clan clanA = new Clan("ClanA");
		Clan clanB = new Clan("ClanB");
		Client A = new Client("A","..",19,20,"0,0",clanA);
		Client S = new Client("S","..",19,20,"0,0",clanA);
		Client D = new Client("D","..",19,20,"0,0",clanA);
		Client F = new Client("F","..",19,20,"0,0",clanB);
		
//		clanA.receiveMember(A.getID());
//		clanB.receiveMember(D.getID());
//		clanB.receiveMember(S.getID());
//		clanB.receiveMember(F.getID());
		
		clanA.addRelic();
		clanB.addRelic();
		
		
		//System.out.println(clan.getClient(2));
		
		
		clanA.addWood(10);
		clanA.addIron(10);
		clanA.addPowder(10);
		System.out.println("--------------------------------");
		clanA.showResources();
		System.out.println("--------------------------------");
		clanA.buyPistol();
		clanA.buyCannon();
		System.out.println("weapons: " + clanA.weapons.print());
		System.out.println("--------------------------------");
		clanA.showResources();
		
		System.out.println("ClanA clients length:" + clanA.clients.getLength());
		System.out.println("ClanB clients length:" + clanB.clients.getLength());

		/*
		System.out.println("ClanA relics length:" + clanA.relics.getLength());
		clanB.attackClan(clanA);
		System.out.println("ClanA relics length:" + clanA.relics.getLength());
		System.out.println("ClanB relics length:" + clanB.relics.getLength());
		*/
				
	}
}

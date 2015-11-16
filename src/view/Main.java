package view;

import controller.Clan;
import controller.Client;

public class Main {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args) {
		
		
		System.out.println("Four members appeared:");
		Client Kappa = new Client();
		Client Omega = new Client();
		Client  Hugo = new Client();
		Client  Val = new Client();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Creation of two clans: A and B, both starts with one relic and 0 resources, weapons and defenses.");
		Clan clanA = new Clan("ClanA");
		Clan clanB = new Clan("ClanB");
		clanA.addRelic();
		clanB.addRelic();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Kappa, Omega and Val join clan A, Hugo join clan B");
		Kappa.joinClan(clanA);
		Omega.joinClan(clanA);
		Val.joinClan(clanA);
		Hugo.joinClan(clanB);
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println(Kappa.getClan());
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		String lola = Hugo.getID();
		String lola2 = Hugo.getClan();
		System.out.println(lola + lola2);
		
		System.out.println("Resources (10 of each) are added to the clan A. ");
		clanA.addWood(10);
		clanA.addIron(10);
		clanA.addPowder(10);
		System.out.println("Amount of resources clan A: ");
		clanA.showResources();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Resources (10 of each) are added to the clan B. ");
		clanB.addWood(10);
		clanB.addIron(10);
		clanB.addPowder(10);
		System.out.println("Amount of resources clan B: ");
		clanB.showResources();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Clan A buys three different weapons.");
		clanA.buyPistol();
		clanA.buyCannon();
		clanA.buySword();
		clanA.showResources();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Clan B buys two different defenses.");
		clanB.buySpartanShields();
		clanB.buyLaserShields();
		clanB.showResources();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("ClanA clients length:" + clanA.clients.getLength());
		System.out.println("ClanB clients length:" + clanB.clients.getLength());
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("ClanA relics length:" + clanA.relics.getLength());
		System.out.println("ClanB relics length:" + clanB.relics.getLength());
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("clanA attacks clanB");
		clanA.PandoraUnderAttack(clanB);
		System.out.println("ClanA relics length:" + clanA.relics.getLength());
		System.out.println("ClanB relics length:" + clanB.relics.getLength());
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

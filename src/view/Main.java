package view;

import controller.Clan;
import controller.Client;

public class Main {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args) {
		
		//new MainWindow();
		
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
		
		System.out.println("Se añaden recursos a los clanes y se muestran los del clanA al final. ");
		clanA.addWood(10);
		clanA.addIron(10);
		clanA.addPowder(10);
		clanB.addWood(10);
		clanB.addIron(10);
		clanB.addPowder(10);
		clanA.showResources();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Se compran las armas del clanA");
		clanA.buyPistol();
		clanA.buyCannon();
		clanA.buySword();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Se compran las defensas del clanB.");
		clanB.buySpartanShields();
		clanB.buyLaserShields();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("ClanA clients length:" + clanA.clients.getLength());
		System.out.println("ClanB clients length:" + clanB.clients.getLength());
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("ClanA relics length:" + clanA.relics.getLength());
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("clanA ataca al clanB");
		clanB.PandoraUnderAttack(clanA);
		System.out.println("ClanA relics length:" + clanA.relics.getLength());
		System.out.println("ClanB relics length:" + clanB.relics.getLength());
				
	}
}

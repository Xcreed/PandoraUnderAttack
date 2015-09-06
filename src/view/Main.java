package view;

import controller.Clan;
import controller.Client;

public class Main {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args) {
		
		Clan clan = new Clan("Hey");
		Client A = new Client("A","..",19,20,"0,0",clan);
		Client S = new Client("S","..",19,20,"0,0",clan);
		Client D = new Client("D","..",19,20,"0,0",clan);
		Client F = new Client("F","..",19,20,"0,0",clan);
		
		clan.receiveMember(A.getID());
		clan.receiveMember(D.getID());
		clan.receiveMember(S.getID());
		clan.receiveMember(F.getID());
		
		System.out.println(clan.getClient(2));
		
				
	}
}

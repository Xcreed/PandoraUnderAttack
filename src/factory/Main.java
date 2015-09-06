package factory;

import java.util.Scanner;
public class Main {

	public static void main(String... prueba) {
		// TODO Auto-generated method stub
		
		Guns pistola = null;
		
		GunFactory fabrica = new GunFactory();
		
		System.out.println("eliga una opcion");
		
		Scanner sc = new Scanner(System.in);
		String opcion = sc.next();
		

		if (sc.hasNextLine()){
			String entrada = sc.nextLine();
	        pistola = fabrica.makeGun(entrada);
	        //if(pistola != null){
	        //printyPrint(pistola);
	        //}else{
	        	//System.out.println("banderin");
	        //}
		}
	}
	
	public static void printyPrint(Guns newGun){
		
		newGun.print();
		
	}
}

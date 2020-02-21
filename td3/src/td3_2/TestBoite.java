package td3_2;

import java.awt.*;

public class TestBoite {
	public static void main(String[] args) {
		
		Boite b1 = new Boite(Color.green);
		
		Objet o1 = new Objet(Color.red, "objet1");
		Boite b2 = new Boite(Color.green, o1);
		
		Boite b3_1 = new Boite(Color.blue);
		Boite b3_2 = new Boite(Color.green, b3_1);
		
		Boite b4_1 = new Boite(Color.blue);
		Boite b4_2 = new Boite(Color.yellow);
		Boite b4_3 = new Boite(Color.green, b4_1);
		
		b4_3.ajouteBoite(b4_2);
		
		Boite b5_1 = new Boite(Color.blue);
		Boite b5_2 = new Boite(Color.green, b5_1, o1);
		
		//Test de l'exception throwable
		
		try {
			o1.changeCouleur(Color.red);
		}catch(Exception e) {
			System.err.println(e);
		}
		
		System.out.println("Fin du programme");
	}
}

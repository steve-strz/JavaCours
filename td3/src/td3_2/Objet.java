package td3_2;
import java.awt.*;

public class Objet {
	Color couleur;
	
	public Objet() {
		couleur = Color.white;
	}
	
	public Objet(Color c, String n) {
		couleur = c;
	}
	
	public void changeCouleur(Color c) throws Exception{
		if (!couleur.equals(c))
			couleur = c;
		else
			throw new Exception("L'objet est d�j� de couleur "+c);
	}
    
	public boolean equals(Object o) {
		Objet currentO = (Objet) o;
		return (currentO.couleur.equals(couleur));
	}
	
	public String toString() {
		return "Objet "+couleur;
	}

}

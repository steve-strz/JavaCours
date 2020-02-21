package td3_2;
import java.awt.*;

public class Boite {
	private static final int MAX_BOITES = 5;
	
	private java.awt.Color color;
	private Objet obj;
	private Boite[] tab = new Boite[MAX_BOITES];
	private int nbBoite = 0;


	public Boite(Color c){
		color = c;
	}
	public Boite(Color c, Objet o){
		color = c;
		obj = o;
	}
	public Boite(Color c, Boite b){
		color = c;
		tab[0] = b;
		nbBoite += 1;
	}
	public Boite(Color c, Boite b, Objet o){
		color = c;
		tab[0] = b;
		nbBoite += 1;
		obj = o;
	}
	
	public Objet getObjet(){
		return this.obj;
	}
	public Color getColor(){
		return this.color;
	}
	
	public void contientObjet(Objet o){
		if(o == this.obj){
			System.out.println("L'objet correspond");
		}else{
			System.out.println("L'objet ne correspond pas");
		}
	}
	
	public void estVide(){
		if(this.obj == null && nbBoite == 0){
			System.out.println("La boite est vide");
		}
		else{
			System.out.println("La boite n'est pas vide");
		}
	}

	public void ajouteBoite(Boite b){
		if(nbBoite < 5){
			tab[nbBoite] = b;
			this.nbBoite++;
		}else {
			System.out.println("Boite pleine");
		}
	}
}



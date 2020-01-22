package td2_2;

public class TripletEntier {
	
	private int[] entiers = new int[3];
	
	public TripletEntier(int e1, int e2, int e3) {
		entiers[0] = e1;
		entiers[1] = e2;
		entiers[2] = e3;
	}
	
	int somme() {
		return this.entiers[0] + this.entiers[1] + this.entiers[2];
	}
	
	int moyenne() {
		return (this.entiers[0] + this.entiers[1] + this.entiers[2]) / 3;
	}
	
	String concatenation() {
		return "" + this.entiers[0] + "" + this.entiers[1] + "" +  this.entiers[2];
	}
	
	void ajoutElement(int pos, int e) {
		if(pos > 2) {
			System.out.println("Vous dépassez le nombre de cases du tableau!!");
		}else {
			this.entiers[pos] = e;
		}
	}
	
	void ajout1erElement(int e) {
		this.entiers[0] = e;
	}
	
	void contient(int e) {
		int pos = 0;
		while(pos < 3 && entiers[pos] != e) {
			pos++;
		}
		if(pos <= 2) {
			System.out.println("Element contenu");
		}else {
			System.out.println("Element non contenu");
		}
	}
}

package exercice2;

public class TripletEntier {
	private int[] entiers = new int[3];
	
	public TripletEntier(int e1, int e2, int e3) {
		entiers[0] = e1;
		entiers[1] = e2;
		entiers[2] = e3;
	}
	
	public int somme() {
		return this.entiers[0] + this.entiers[1] + this.entiers[2];
	}
	
	public int moyenne() {
		return (this.entiers[0] + this.entiers[1] + this.entiers[2]) / 3;
	}
	
	public String concatenation() {
		return "" + this.entiers[0] + this.entiers[1] + this.entiers[2];
	}
	
	public void ajoutElement(int pos, int e) {
		if(pos <= 2 && pos >= 0) {
			this.entiers[pos] = e;
		}else {
			System.out.println("Position du tableau invalid [Array Index Out Of Bounds Exception]");
		}
	}
	
	public void ajout1erElement(int e) {
		this.entiers[0] = e;
	}
	
	public void contient(int e) {
		for(int i = 0; i < entiers.length; i++) {
			if(entiers[i] == e) {
				System.out.println("La case " + i + " du tableau contient bien la valeur " + e);
			}
		}
	}
}

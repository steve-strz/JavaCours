package td2;

public class Compte {

	private int solde = 0;
	private String name;
	
	public Compte(int s, String n) {
		solde = s;
		name = n;
	}
	
	void deposer(int montant) {
		solde += montant;
	}
	
	void retirer(int montant) {
		solde -= montant;
	}
	
	void virerVers(int montant, Compte destination) {
		this.retirer(montant);
		destination.deposer(montant);
	}
	
	void afficher() {
		System.out.println("Solde du compte de "+this.name+" : "+solde);
	}
}

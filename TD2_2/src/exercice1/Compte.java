package exercice1;

public class Compte {
	private int solde = 0;
	private String name = "";

	public Compte(String n) {
		name = n;
	}
	
	public void deposer(int montant) {
		solde += montant;
	}
	
	public void retirer(int montant) {
		solde -= montant;
	}
	
	public void virerVers(int montant, Compte destination) {
		this.retirer(montant);
		destination.deposer(montant);
	}
	
	public void afficher() {
		System.out.println("Solde du compte de " + name + " : " + solde);
	}
}

package td2;

public class TestCompte {
	
	/**2)
	 * 
	 * public static void main(String[] args) {
		Compte compte1 = new Compte();
		Compte compte2 = new Compte();
		
		compte1.deposer(500);
		compte2.deposer(1000);
		
		compte2.retirer(10);
		compte1.virerVers(75, compte2);
		
		compte1.afficher();
		compte2.afficher();
	
	}
	**/
	
	public static void main(String[] args) {
		Compte comptes[] = new Compte[10];
		
		for(int i = 0; i < comptes.length; i++) {
			comptes[i] = new Compte(0, args[i]);
		}
		
		for(int i = 0; i < comptes.length; i++) {
			comptes[i].deposer(200 + (100*i));
		}
		
		for(int i = 0; i < comptes.length; i++) {
			for(int j = i+1; j < comptes.length; j++) {
				comptes[i].virerVers(20, comptes[j]);
			}
		}
		
		for(int i = 0; i < comptes.length; i++) {
			comptes[i].afficher();
			System.out.println("-------------");
		}
	}
}

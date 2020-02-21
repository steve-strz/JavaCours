package td2_3;

public class TestJourSemaine {
	public static void main(String[] args) {
		JourSemaine j1 = new JourSemaine(0);
		
		int n = j1.getNumero();
		System.out.println("getNumero = " + n);
		
		String j = j1.afficher();
		System.out.println("afficher = " + j);
		
		JourSemaine j1_1 = new JourSemaine();
		j1_1 = j1.veille();
		System.out.println("veille = " + j1_1.afficher());
		
		JourSemaine j1_2 = new JourSemaine();
		j1_2 = j1.lendemain();
		System.out.println("demain = " + j1_2.afficher());
		
	}
}

package td2_3;

public class JourSemaine {
	private static final String[] jours = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
	private int indice;
	
	public JourSemaine() {
		indice = 0;
	}
	public JourSemaine(int e) {
		if(e < 0 || e > 6) {
			System.out.println("Imposse de créer cet objet avec cette index");
		}else {
			indice = e;
		}
	}
	public JourSemaine(String c) {
		for(int i = 0; i < jours.length; i++) {
			if(jours[i].equals(c)) {
				indice = i;
			}
		}
	}
	
	public int getNumero() {
		return this.indice;
	}
	public String afficher() {
		return jours[this.indice];
	}
	public JourSemaine veille() {
		if(this.indice == 0) {
			JourSemaine j = new JourSemaine(6);
			return j;
		}else {
			JourSemaine j = new JourSemaine(this.indice-1);
			return j;
		}
	}
	public JourSemaine lendemain() {
		if(this.indice == 6) {
			JourSemaine j = new JourSemaine(0);
			return j;
		}else {
			JourSemaine j = new JourSemaine(this.indice+1);
			return j;
		}
	}
}

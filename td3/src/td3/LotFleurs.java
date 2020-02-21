package td3;

public class LotFleurs {
	private Fleur type;
	private int nbFleurs;
	
	public LotFleurs(Fleur f, int nb){
		type = f;
		nbFleurs = nb;
	}
	
	@Override
	public String toString() {
		return "LotFleurs [type=" + type + ", nbFleurs=" + nbFleurs + "]";
	}

	public Fleur getFleur(){
		return this.type;
	}
	
	public int getNbFleurs(){
		return this.nbFleurs;
	}
}

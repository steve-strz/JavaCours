package td3;

public class Stock {
	private int s_roses;
	private int s_tulipes;
	private int s_oeillets;
	
	private Fleur roses;
	private Fleur tulipes;
	private Fleur oeillets;
	
	public Stock(Fleur r, Fleur t, Fleur o){
		roses = r;
		tulipes = t;
		oeillets = o;
	}
	
	public void ajouteRose(int e){
		s_roses += e;
	}
	public void ajouteTulipe(int e){
		s_tulipes += e;
	}
	public void ajouteOeillet(int e){
		s_oeillets += e;
	}
	
	public boolean bouquetFaisable(Bouquet b){
		boolean ok;
		if(b.getLotRose().getNbFleurs() > s_roses || b.getLotTulipe().getNbFleurs() > s_tulipes || b.getLotOeillet().getNbFleurs() > s_oeillets){
			ok = false;
		}else{
			ok = true;
		}
		return ok;
	}
	
	@Override
	public String toString() {
		return "Stock [s_roses=" + s_roses + ", s_tulipes=" + s_tulipes
				+ ", s_oeillets=" + s_oeillets + ", roses=" + roses
				+ ", tulipes=" + tulipes + ", oeillets=" + oeillets + "]";
	}

	public double valeurStock(){
		double v;
		v = (this.roses.getCost() * s_roses) + (this.tulipes.getCost() * s_tulipes) + (this.oeillets.getCost() * s_oeillets);
		return v;
	}
}

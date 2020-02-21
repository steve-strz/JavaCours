package td3;

public class Bouquet {
	
	private LotFleurs lot1;
	private LotFleurs lot2;
	private LotFleurs lot3;
	
	public Bouquet(LotFleurs l1, LotFleurs l2, LotFleurs l3){
		lot1 = l1;
		lot2 = l2;
		lot3 = l3;
	}
	
	public LotFleurs getLotRose(){
		return lot1;
	}
	public LotFleurs getLotTulipe(){
		return lot2;
	}
	public LotFleurs getLotOeillet(){
		return lot3;
	}
	
	public double prix(){
		double p = 0.00;
		p = (this.lot1.getFleur().getCost() * this.lot1.getNbFleurs()) + (this.lot2.getFleur().getCost() * this.lot2.getNbFleurs()) + (this.lot3.getFleur().getCost() * this.lot3.getNbFleurs());
		return p;
	}	
}

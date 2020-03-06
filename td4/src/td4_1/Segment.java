package td4_1;

public class Segment{
	private Point origine;
	private Point extremite;
	
	public Segment() {
		origine = new Point(1.00,1.00);
		extremite = new Point(2.00,2.00);
	}
	public Segment(Point origine_, Point extremite_) throws Exception{
		if(origine_ == extremite_) {
			throw new Exception("Les points sont égaux (same points)");
		}else {			
			origine = origine_;
			extremite = extremite_;
		}
	}	
	
	public double longueur() throws Exception {
		if(this.extremite.getDistance(this.origine) == 0) {
			throw new Exception("La longueur est null (0) ");
		}else {			
			return this.extremite.getDistance(this.origine);
		}
	}
	
	public String toString() {
		return "Origine = [" + origine.getX() + "," + origine.getY() + "] || Extremite = [" + extremite.getX() + "," + extremite.getY() + "]";
	}
	
	public Segment projX() throws Exception{
		Point pExtremiteX = new Point(this.extremite.getX(), this.extremite.getY());
		pExtremiteX = pExtremiteX.projX();
		
		Point pOrigineX = new Point(this.origine.getX(), this.origine.getY());
		pOrigineX = pOrigineX.projX();
		
		Segment seg = new Segment(pOrigineX, pExtremiteX);
		return seg;
	}
	
	public Segment projY() throws Exception{
		Point pExtremiteY = new Point(this.extremite.getX(), this.extremite.getY());
		pExtremiteY = pExtremiteY.projY();
		
		Point pOrigineY = new Point(this.origine.getX(), this.origine.getY());
		pOrigineY = pOrigineY.projY();
		
		Segment seg = new Segment(pOrigineY, pExtremiteY);
		return seg;
	}
}

package td4_1;

import java.awt.Color;

public class ColoredPoint extends Point{
	private Color couleur;
	
	public ColoredPoint(double x, double y, Color c) {
		super(x,y);
		couleur = c;
	}
	public void colore(Color c) {		
		couleur = c;
	}

	@Override
	public boolean equals(Object o) {
		ColoredPoint p = (ColoredPoint) o;
		if(memeCouleur(p) && super.equals(p)) 
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return "La couleur est " + this.getColor() + " et les coordonnées sont " + super.toString();
	}

	public boolean memeCouleur(ColoredPoint p) {
		if(p.getColor() == this.getColor()) {
			return true;
		}else {
			return false;
		}
	}
	
	public Color getColor() {
		return this.couleur;
	}
}

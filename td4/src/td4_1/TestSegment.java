package td4_1;

import java.awt.Color;

public class TestSegment {
	
	public static void main(String[] args) {		
		Point p1 = new Point(19.52, 25.7);
		Point p2 = new Point(18.52, 25.7);
		try {			
			Segment seg1 = new Segment(p1, p2);
			System.out.println(seg1);
			double distance = seg1.longueur();			
			System.out.println("Distance du segment : " + distance);
			Segment seg2 = new Segment();
			seg2 = seg1.projX();
			System.out.println(seg2.toString());
			seg2 = seg1.projY();
			System.out.println(seg2.toString());
		}catch(Exception e) {
			System.err.println(e);
		}
		
		ColoredPoint pc1 = new ColoredPoint(1,3,Color.red);
		ColoredPoint pc2 = new ColoredPoint(1,3,Color.white);
		
		boolean sameColor = pc1.memeCouleur(pc2);
		System.out.println("Les couleurs de pc1 et pc2 sont les mêmes ? " + sameColor);
		
		System.out.println(pc1.toString());
		
		double distance = pc1.getDistance(pc2);
		System.out.println(distance);
		
		boolean equals = pc1.memeCouleur(pc2);
		System.out.println("Les points sont égaux ? " + equals);
		
		Point pcProj = new Point();
		pcProj = pc1.projX();
		System.out.println(pcProj.toString());
		pcProj = pc1.projY();
		System.out.println(pcProj.toString());
		
		double getValueX = pc1.getX();
		double getValueY = pc1.getY();
		
		System.out.println("getX = " + getValueX + " || getY = " + getValueY);
		
		boolean equals2 = pc1.equals(pc2);
		System.out.println("Les points sont égaux ? " + equals2);
	}
}

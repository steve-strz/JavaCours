package td4_1;

public class Point {
	private double x = 0.00;
	private double y = 0.00;
	
	public Point() {
		this(0,0);
	}
	public Point(double x_, double y_) {
		x = x_;
		y = y_;
	}
	
	public String toString() {
		return this.toString();
	}
	public double getDistance(Point p) {
		return Math.sqrt(Math.pow(p.getY() - this.y, 2) + Math.pow(p.getX() - this.x, 2));
	}
	public boolean equals(Point p) {
		if(Double.compare(p.getX(), this.x) == 0 && Double.compare(p.getY(), this.y) == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public Point projX() {
		Point p = new Point(this.x, -this.y);
		return p;
	}
	public Point projY() {
		Point p = new Point(-this.x, this.y);
		return p;
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
}

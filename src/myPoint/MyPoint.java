package myPoint;

//10.4
public class MyPoint {
	private double x, y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance(MyPoint point) {
		double x1 = point.getX();
		double y1 = point.getY();
		double x2 = this.x;
		double y2 = this.y;
		return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
	}

	public double distance(double x, double y) {
		return distance(new MyPoint(x, y));

	}
}

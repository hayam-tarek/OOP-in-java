package abstractGeometricObject;

//13.11
public class Octagon extends GeometricObject implements Colorable, Cloneable {

	private double side = 1;

	public Octagon(double side) {
		super();
		this.side = side;
	}

	@Override
	public void howToColor() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2 + (4 / Math.sqrt(2))) * side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 8 * side;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Octagon: side = " + side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}

package abstractGeometricObject;
//13.7
public class Square extends GeometricObject implements Colorable {
	private double side = 1;

	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void howToColor() {
		// TODO Auto-generated method stub
		System.out.println("Color all four sides.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square: side = " + side;
	}

}

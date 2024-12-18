package abstractGeometricObject;

public class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		super();
		if (side1 + side2 >= side3 && side1 + side3 >= side2 && side2 + side3 >= side1) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			throw new IllegalTriangleException("Invalid Triangle");
		}
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	@Override
	public double getArea() {
		double s = this.getPerimeter() / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}

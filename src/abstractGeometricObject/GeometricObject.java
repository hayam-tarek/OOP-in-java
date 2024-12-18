package abstractGeometricObject;

//13.1 , 13.5 , 13.12
public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color;
	private Boolean filled;

	public GeometricObject() {
		// TODO Auto-generated constructor stub
	}

	public GeometricObject(String color, Boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else
			return 0;
	}

	public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
		return g1.compareTo(g2) == 1 ? g1 : g2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}

	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}

package myPoint;

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);

		System.out.println(point1.distance(point2));
		System.out.println(point1.distance(4, 3));
	}

}

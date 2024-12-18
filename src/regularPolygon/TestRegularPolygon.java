package regularPolygon;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon obj1 = new RegularPolygon();
		RegularPolygon obj2 = new RegularPolygon(6, 4);
		RegularPolygon obj3 = new RegularPolygon(10, 4, 5.6, 7.8);

		RegularPolygon[] arr = { obj1, obj2, obj3 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Perimeter of element " + (i + 1) + " is " + arr[i].getPerimeter());
			System.out.println("Area of element " + (i + 1) + " is " + arr[i].getArea());
			System.out.println();
		}
	}

}

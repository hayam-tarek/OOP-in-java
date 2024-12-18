package abstractGeometricObject;

import java.util.Scanner;

public class Test {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
//		System.out.println("Enter the three sides of the triangle 1! ");
//		double a = inScanner.nextDouble();
//		double b = inScanner.nextDouble();
//		double c = inScanner.nextDouble();
//		System.out.println("Enter the three sides of the triangle 2! ");
//		double x = inScanner.nextDouble();
//		double y = inScanner.nextDouble();
//		double z = inScanner.nextDouble();
//		Triangle tri1 = null;
//		Triangle tri2 = null;
//		try {
//			tri1 = new Triangle(a, b, c);
//			tri2 = new Triangle(x, y, z);
//		} catch (IllegalTriangleException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
//		System.out.println("Enter the color and filled or not! \" enter true or false \" ");
//		String color = inScanner.next();
//		Boolean filled = inScanner.nextBoolean();
//		tri1.setColor(color);
//		tri1.setFilled(filled);
//
//		System.out.println("Area = " + tri1.getArea());
//		System.out.println("Perimeter = " + tri1.getPerimeter());
//		System.out.println("Color is " + tri1.getColor());
//		System.out.println("Filled or not? " + tri1.getFilled());

//		System.out.println("Area of tri1 = " + tri1.getArea());
//		System.out.println("Area of tri2 = " + tri2.getArea());
//		System.out.println("The max " + GeometricObject.max(tri1, tri2));

//		System.out.println("Enter the side of the square!");
//		double s = inScanner.nextDouble();
//		Square sq1 = new Square(s);
//		GeometricObject[] arr = { tri1, sq1, tri2 };
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " area = ");
//			System.out.println(arr[i].getArea());
//			if (arr[i] instanceof Colorable) {
//				System.out.print(arr[i] + " ");
//				((Colorable) arr[i]).howToColor();
//			}
//		}

//		try {
//			System.out.println("first octagon: ");
//			Octagon o1 = new Octagon(5);
//			System.out.println("	Area = " + o1.getArea());
//			System.out.println("	perimeter = " + o1.getPerimeter());
//
//			Octagon o2 = (Octagon) o1.clone();
//			System.out.println("Second octagon: ");
//			System.out.println("	Area = " + o2.getArea());
//			System.out.println("	perimeter = " + o2.getPerimeter());
//			System.out.println("compare to: ");
//			System.out.println("	the larget one " + (o1.compareTo(o2) == 1 ? o1 : o2));
//
//			o2.setSide(10);
//			System.out.println("Second octagon after change: ");
//			System.out.println("	Area = " + o2.getArea());
//			System.out.println("	perimeter = " + o2.getPerimeter());
//			System.out.println("compare to: ");
//			System.out.println("	the larget one " + (o1.compareTo(o2) == 1 ? o1 : o2));
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}

		Octagon o1 = new Octagon(5);
		Octagon o2 = new Octagon(7);
		Square s1 = new Square(5);
		Square s2 = new Square(7);
		GeometricObject[] arr = { o1, o2, s1, s2 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getArea());
		}
		System.out.println("The total area = " + GeometricObject.sumArea(arr));
		inScanner.close();

	}

}

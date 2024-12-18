package geometricObject;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter the three sides of the triangle! ");
		double a = inScanner.nextDouble();
		double b = inScanner.nextDouble();
		double c = inScanner.nextDouble();
		System.out.println("Enter the color and filled or not! \" enter true or false \" ");
		String color = inScanner.next();
		Boolean filled = inScanner.nextBoolean();
		Triangle tri1 = new Triangle(a, b, c);
		tri1.setColor(color);
		tri1.setFilled(filled);
		
		System.out.println(tri1.toString());
		System.out.println("Area = " + tri1.getArea());
		System.out.println("Perimeter = "+tri1.getPerimeter());
		System.out.println("Color is "+tri1.getColor());
		System.out.println("Filled or not? "+tri1.getFilled());

		inScanner.close();

	}

}

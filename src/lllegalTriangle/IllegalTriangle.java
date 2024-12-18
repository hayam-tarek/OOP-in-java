package lllegalTriangle;

import java.util.Scanner;

public class IllegalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iScanner = new Scanner(System.in);
		Triangle tri1 = null;
		while (true) {
			try {

				System.out.println("Enter 3 sides of a triangle");
				double s1 = iScanner.nextDouble();
				double s2 = iScanner.nextDouble();
				double s3 = iScanner.nextDouble();
				tri1 = new Triangle(s1, s2, s3);
				break;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				iScanner.nextLine();
			}
		}
		System.out.println("Area = " + tri1.getArea());
		System.out.println("Perimeter = " + tri1.getPerimeter());
		iScanner.close();
	}

}

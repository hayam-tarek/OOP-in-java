package quadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a, b and c for the equation");
		int a = inputScanner.nextInt();
		int b = inputScanner.nextInt();
		int c = inputScanner.nextInt();
		QuadraticEquation eq = new QuadraticEquation(a, b, c);

		double discriminant = eq.getDiscriminant();
		if (discriminant > 0) {
			System.out.println("1st root = " + eq.getRoot1());
			System.out.println("2nd root = " + eq.getRoot2());
		} else if (discriminant == 0) {
			System.out.println("root = " + eq.getRoot1());
		} else {
			System.out.println("The equation has no roots.");
		}

		inputScanner.close();

	}

}

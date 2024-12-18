package location;

import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int row = inputScanner.nextInt();
		int col = inputScanner.nextInt();
		double[][] arr = new double[row][col];
		System.out.println("Enter the array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = inputScanner.nextDouble();
			}
		}
		Location objLocation = Location.locateLargest(arr);
		System.out.printf("The location of the largest element is %f at (%d, %d)", objLocation.maxVal, objLocation.row,
				objLocation.col);
		inputScanner.close();
	}

}

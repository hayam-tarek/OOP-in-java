package primeNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class TestPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
		int num = inScanner.nextInt();
		
		int[] numbers = PrimeNumbers.getPrimesLessThan(num);
		System.out.println(Arrays.toString(numbers));
		inScanner.close();
	}

}

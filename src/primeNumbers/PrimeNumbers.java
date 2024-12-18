package primeNumbers;

import java.util.Arrays;

//10.6
public class PrimeNumbers {

	public static int[] getPrimesLessThan(int num) {

		int[] numbers = new int[num];
		int count = 0;
		for (int i = num; i > 1; i--) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				numbers[count] = i;
				count++;
			}
		}
		numbers = Arrays.copyOfRange(numbers, 0, count);
		return numbers;
	}

}

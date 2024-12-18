package numberFormatException;
//12.1
import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
		System.out.println("calculator: ");
		try {
			int x = inScanner.nextInt();
			char operation = inScanner.next().charAt(0);
			int y = inScanner.nextInt();
			switch (operation) {
			case '+': {
				System.out.println(x + " " + operation + " " + y + " = " + (x + y));
			}
			case '-': {
				System.out.println(x + " " + operation + " " + y + " = " + (x - y));
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + operation);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Wrong Input: " + e);
		}
		inScanner.close();
	}

}

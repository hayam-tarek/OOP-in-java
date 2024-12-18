package inputMismatchException;
//12.2
import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iScanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			System.out.println("Enter two numbers! ");
			try {
				num1 = iScanner.nextInt();
				num2 = iScanner.nextInt();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("u must enter integer only");
				iScanner.nextLine();
			}
		}
		System.out.println("the sum = " + (num1 + num2));
		iScanner.close();
	}

}

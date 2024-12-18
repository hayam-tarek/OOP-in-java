package outOfMemoryError;
//12.10
public class OutOfMemoryError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 1200000000;
		try {
			byte[] array = new byte[length];
			System.out.println(array);
		}
		catch (Exception ex) { // Handle OutOfMemoryError
			System.out.println(ex.getMessage());
		}
		// Continue program
		System.out.println("Error handled program continues... ");
	}

}

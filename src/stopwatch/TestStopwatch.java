package stopwatch;

public class TestStopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stopwatch s1 = new Stopwatch();
		long sum = 0;
		for (int i = 0; i < 1000000000; i++) {
			sum += i;
			sum /= 2;
			sum *= 2;
		}
		System.out.println(sum);
		s1.stop();
		System.out.println(s1.getElapsedTime());
	}

}

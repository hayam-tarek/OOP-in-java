package quadraticEquation;

//9.10
public class QuadraticEquation {
	private int a, b, c;

	public QuadraticEquation(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}

	public double getRoot1() {
		if (this.getDiscriminant() < 0) {
			return 0;
		}
		return (-1 * b + Math.sqrt(this.getDiscriminant())) / (2 * a);
	}

	public double getRoot2() {
		if (this.getDiscriminant() < 0) {
			return 0;
		}
		return (-1 * b - Math.sqrt(this.getDiscriminant())) / (2 * a);
	}
}

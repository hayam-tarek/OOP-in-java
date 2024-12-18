package stock;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock orcl = new Stock("ORCL", "Oracle Corporation");
		orcl.previousClosingPrice = 34.5;
		orcl.currentPrice = 34.35;
		System.out.println(orcl.getChangePercent());

	}

}

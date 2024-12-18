package stock;
//9.2
public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}

	public double getChangePercent() {
		double change = ((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
		return change;
	}

}

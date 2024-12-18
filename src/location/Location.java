package location;
//9.13
public class Location {
	public int row;
	public int col;
	public double maxVal;

	public static Location locateLargest(double[][] a) {
		Location obj = new Location();
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					obj.row = i;
					obj.col = j;
					obj.maxVal = a[i][j];
					max = a[i][j];
				}
			}
		}
		return obj;
	}
}

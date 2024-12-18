package sortArrayList;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;


public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 1996;
		double doubleNum = 6.7;
		Integer intObj = Integer.MAX_VALUE;
		Double doubleObj = Double.MAX_VALUE;
		BigInteger bigInteger = new BigInteger("123456789987654321");
		BigDecimal bigDecimal = new BigDecimal(.99999999999999999999999);
		ArrayList<Number> list = new ArrayList<>();
		
		list.add(bigInteger);
		list.add(bigDecimal);
		list.add(intNum);
		list.add(doubleNum);
		list.add(intObj);
		list.add(doubleObj);
		
		sort(list);
		System.out.println(list);
	}

	public static void sort(ArrayList<Number> list) {
		Collections.sort(list, new Comparator<Number>() {
            @Override
            public int compare(Number num1, Number num2) {
                double value1 = num1.doubleValue();
                double value2 = num2.doubleValue();

                if (value1 < value2) {
                    return -1;
                } else if (value1 > value2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
	}

}

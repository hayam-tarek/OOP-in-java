package arrayList1;

import java.util.*;
//11.12  11.13  11.14
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("Enter 5 numbers:");
		int count = 5;
		while (count > 0) {
			list.add(inScanner.nextDouble());
			count--;
		}
		System.out.println("The sum = " + sum(list));
		removeDuplicate(list);
		ArrayList<Double> list2 = union(list, list);
		System.out.println("The union: " + list2);
		inScanner.close();
	}

	public static double sum(ArrayList<Double> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}

	public static void removeDuplicate(ArrayList<Double> list) {
		ArrayList<Double> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!list2.contains(list.get(i))) {
				list2.add(list.get(i));
			}
		}
		System.out.print("The distinct integers are ");
		for (Double double1 : list2) {
			System.out.print(double1 + " ");
		}
		System.out.println();
	}

	public static ArrayList<Double> union(ArrayList<Double> list1, ArrayList<Double> list2) {
		ArrayList<Double> list3 = new ArrayList<>();
		for (Double double1 : list1) {
			list3.add(double1);
		}
		for (Double double1 : list2) {
			list3.add(double1);
		}
		return list3;
	}

}

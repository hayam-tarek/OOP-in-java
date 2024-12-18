package mydate;

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate(561555550000l);
		System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
		
		MyDate date2 = new MyDate();
		System.out.println(date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());
		
		MyDate date3 = new MyDate(34355555133101L);
		System.out.println(date3.getDay() + "/" + date3.getMonth() + "/" + date3.getYear());
	}

}

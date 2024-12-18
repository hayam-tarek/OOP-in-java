package mydate;

import java.util.GregorianCalendar;

//10.14
public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
		this(System.currentTimeMillis());
	}

	public MyDate(long elapseTime) {
		setDate(elapseTime);
	}

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month + 1;
	}

	public int getDay() {
		return day;
	}

	public void setDate(long elapseTime) {
		GregorianCalendar dateCalendar = new GregorianCalendar();
		dateCalendar.setTimeInMillis(elapseTime);
		year = dateCalendar.get(GregorianCalendar.YEAR);
		month = dateCalendar.get(GregorianCalendar.MONTH);
		day = dateCalendar.get(GregorianCalendar.DAY_OF_MONTH);

	}
}

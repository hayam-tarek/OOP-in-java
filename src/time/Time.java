package time;

//10.1
public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long elapseTime) {
		setTime(elapseTime);
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setTime(long elapseTime) {
		this.second = (int) (elapseTime / 1000) % 60;
		this.minute = (int) (elapseTime / (1000 * 60)) % 60;
		this.hour = (int) (elapseTime / (1000 * 60 * 60)) % 24;
	}
}

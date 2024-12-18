package stopwatch;

//9.6
public class Stopwatch {
	private long startTime;
	private long endTime;

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public Stopwatch() {
		this.start();
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}

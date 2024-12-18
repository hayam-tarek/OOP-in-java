package fan;

//9.8
public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fan() {

	}

	@Override
	public String toString() {
		if (this.on) {
			return "speed = " + this.speed + " ,color = " + this.color + " and radius = " + this.radius;
		} else {
			return "color = " + this.color + " ,radius = " + this.radius + " and fan is off";
		}
	}

}

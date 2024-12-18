package geometricObject;

public class GeometricObject {
	private String color;
	private Boolean filled;
	public GeometricObject() {
		// TODO Auto-generated constructor stub
	}
	public GeometricObject(String color, Boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getFilled() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	
}

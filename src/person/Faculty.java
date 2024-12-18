package person;

public class Faculty extends Employee{
	protected double officeHours;
	protected double rank;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.name;
	}

	public Faculty(String name, String address, String phoneNumber, String emailAdress) {
		super(name, address, phoneNumber, emailAdress);
		// TODO Auto-generated constructor stub
	}
}

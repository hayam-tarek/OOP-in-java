package person;

public class Staff extends Employee{
	protected String title;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.name;
	}

	public Staff(String name, String address, String phoneNumber, String emailAdress) {
		super(name, address, phoneNumber, emailAdress);
		// TODO Auto-generated constructor stub
	}
}

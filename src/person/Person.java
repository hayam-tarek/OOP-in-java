package person;

public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String emailAdress;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.name;
	}

	public Person(String name, String address, String phoneNumber, String emailAdress) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
	}
}

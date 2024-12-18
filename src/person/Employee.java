package person;

import mydate.MyDate;

public class Employee extends Person{
	protected String office;
	protected Double salary;
	protected MyDate dateHire = new MyDate();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.name;
	}

	public Employee(String name, String address, String phoneNumber, String emailAdress) {
		super(name, address, phoneNumber, emailAdress);
		// TODO Auto-generated constructor stub
	}
}

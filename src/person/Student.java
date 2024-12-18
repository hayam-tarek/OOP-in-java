package person;

public class Student extends Person{
	protected final static String FRESHMAN = "freshman";
	protected final static String SOPHOMORE = "sophomore";
	protected final static String JUNIOR = "junior";
	protected final static String SENIOR = "senior";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + this.name;
	}

	public Student(String name, String address, String phoneNumber, String emailAdress) {
		super(name, address, phoneNumber, emailAdress);
		// TODO Auto-generated constructor stub
	}
}

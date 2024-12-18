package person;
//11.2
public class Test {
	public static void main(String[] args) {
		Person person = new Person("ahmed", null, null, null);
		Student student = new Student("hayam", null, null, null);
		Employee employee = new Employee("mo", null, null, null);
		Faculty faculty = new Faculty("cu", null, null, null);
		Staff staff = new Staff("sameh", null, null, null);
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}

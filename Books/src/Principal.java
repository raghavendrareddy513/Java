
public class Principal {
	String name;
	int id;
	String subject;
	int salary;
	String gender;
	String address;
	long phonenumber;
	String email;
	String qualification;
	String schoolname;
	void eat() {
		System.out.println(name+"sir is eating ");
	}
	void sleep()
	{
		System.out.println(name +" sir is sleeping");
	}
	public Principal(String name, int id, String subject, int salary, String gender, String address, long phonenumber,
			String email, String qualification, String schoolname) {
		super();
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.salary = salary;
		this.gender = gender;
		this.address = address;
		this.phonenumber = phonenumber;
		this.email = email;
		this.qualification = qualification;
		this.schoolname = schoolname;
	
	}
	
}

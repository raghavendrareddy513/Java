import java.util.Scanner;

public class PrincipalApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter name of principal");
	String name = scan.nextLine();
	System.out.println("Enter id ");
	int id = scan.nextInt();
	System.out.println("Enter subject name");
	scan.nextLine();
	String subject = scan.next();
	System.out.println("Enter salary");
	int salary = scan.nextInt();
	System.out.println("Enter gender");
	scan.nextLine();
	String gender = scan.next();
	System.out.println("Enter address: ");
	scan.nextLine();
	String address = scan.nextLine();
	System.out.println("Enter phone number");
	long phonenumber = scan.nextLong();
	System.out.println("Enter email");
	scan.nextLine();
	String email = scan.next();
	System.out.println("Enter qualification");
	String qualification = scan.next();
	System.out.println("Enetr School name");
	String schoolname =scan.nextLine();
	Principal p = new Principal(name, id, subject, salary, gender, address, phonenumber, email, qualification, schoolname);
	System.out.println(p.name+" "+p.id+" "+p.subject+" "+p.salary+" "+p.gender+" "+p.address+" "+p.phonenumber+" "+p.email+" "+p.qualification+" "+p.schoolname);
	p.eat();
	p.sleep();
			}
}

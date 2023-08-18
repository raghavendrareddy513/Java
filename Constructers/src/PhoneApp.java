import java.util.Scanner;

public class PhoneApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter phone company");
	String company = scan.nextLine();
	System.out.println("Enter cost of a phone");
	int cost =scan.nextInt();
	System.out.println("Enter phone colour");
	scan.nextLine();
	String colour = scan.nextLine();
	System.out.println("Enter processor");
	String processor = scan.nextLine();
	System.out.println("Enter phone camera pixel");
	String camerapixel = scan.next();
	System.out.println("Enter phone ram");
	String ram = scan.next();
	System.out.println("Enter phone storage");
	String storage = scan.next();
	System.out.println("Enter connectivity of a phone");
	String connectivity = scan.next();
	System.out.println("Enter disply of a phone ");
	String disply = scan.next();
	System.out.println("Enter os of a phone");
	String os = scan.next();
	Phone p = new Phone(company, cost, colour, processor, camerapixel, ram, storage, connectivity, disply, os);
	System.out.println(p.company+" "+p.cost+" "+p.colour+" "+p.processor+" "+p.camerapixel+" "+p.ram+" "+p.storage+" "+p.disply+" "+p.os);
	p.phonecharged();
	p.phoneoff();
	
}
}

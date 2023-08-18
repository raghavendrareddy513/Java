import java.util.Scanner;

public class CaluculatorApp {
public static void main(String[] args) {
	Caluculator cla = new Caluculator();
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.println("Enter + or - or * or /: ");
		char opt = scan.next().charAt(0);
	switch(opt)
	{
		case '+':
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			System.out.println("Addition operator"+cla.add(n1, n2));
			break;
		case '-':
			int n3 = scan.nextInt();
			int n4 = scan.nextInt();
			System.out.println("Subtraction operator"+cla.sub(n3, n4));
			break;
		case '*':
			int n5 = scan.nextInt();
			int n6 = scan.nextInt();
			System.out.println("Multiplication operator"+cla.mul(n5, n6));
			break;
		case '/':
			int n7 = scan.nextInt();
			int n8 = scan.nextInt();
			System.out.println("Division operator"+cla.div(n7, n8));
			break;
		case '%':
			int n9 = scan.nextInt();
			int n10 = scan.nextInt();
			System.out.println("remainder operator"+cla.rem(n9, n10));
			break;
		case '^':
			int n11 = scan.nextInt();
			System.out.println("Squarem operator"+cla.square(n11));
			break;
		case '!':
			System.out.println("Bye");
			return;
		default:
			System.out.println("see the message");
	
}
}
}
}

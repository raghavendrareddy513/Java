import java.util.Scanner;

public class ArmStrongNumApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n value: ");
	int n = scan.nextInt();
	ArmStrongNum a = new ArmStrongNum();
	a.armstrong(n);
	scan.close();
}
}

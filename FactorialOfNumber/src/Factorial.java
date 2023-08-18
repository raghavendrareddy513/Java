import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter N value: ");
	int n= sc.nextInt();
	int fact=1;
	for (int i=n;i>0;i--)
	{
		fact =fact*i;
	}
	System.out.println("Factorial of "+n+"is : "+fact);
	sc.close();
}
}

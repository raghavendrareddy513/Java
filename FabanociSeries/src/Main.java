import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n value: ");
	int n= scan.nextInt();
	int fib1 =0;
	int fib2=1;
	if(n==0)
	{
		System.out.println(fib1);
	}
	else if(n==2)
	{
		System.out.println(fib1+" "+fib2);
	}
	else
	{
		System.out.print(fib1+" "+fib2+" ");
		for(int i=3;i<=n;i++)
		{
			int nextNum=fib1+fib2;
			System.out.print(" "+nextNum);
			fib1=fib2;
			fib2=nextNum;
		}
	}
}
}

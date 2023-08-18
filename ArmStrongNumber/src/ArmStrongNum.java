
public class ArmStrongNum {
public  void armstrong(int n)
{
	int temp=n;
	String su=Integer.toString(temp);
	int b=su.length();
	int s=0;
	while(n!=0)
	{
		int digit = n%10;
		s=s+(int)Math.pow(digit,b);
		n=n/10;
	}
	if(temp==s)
	{
		System.out.println("Arm");
	}
	else
	{
		System.out.println("NOt Arm");
	}
	
}
}

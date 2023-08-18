import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1d length: ");
	String [][]arr=new String[sc.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter 2nd dimension length"+i);
		arr[i]=new String[sc.nextInt()];
	}
	for (int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter name of a bank"+i+"Enter customer number"+j);
			arr[i][j]=sc.next();
		}
	}
	for (int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}

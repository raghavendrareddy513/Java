import java.util.Scanner;

public class ThreedArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1d value: ");
	int arr[][][] = new int[sc.nextInt()][][];
	System.out.println("Enter 2D length for every 1D");
	for(int i =0;i<arr.length-1;i++)
	{
		System.out.println("Enter 2d value for 1d value: "+i);
		arr[i]=new int[sc.nextInt()][];
	}
	System.out.println("Enter 3D length for every 1D and 2D");
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter 3D length for 1D "+i+"2D "+j);
			arr[i][j]= new int[sc.nextInt()];
		}
	}
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr[i].length-1;j++)
		{
			for(int k=0;k<arr[i][j].length-1;k++)
			{
				System.out.println("Enter marks of school "+i+" Class "+j+" Student "+k);
				arr[i][j][k]=sc.nextInt();
			}
		}
	}
	System.out.println("Array Contents Are....");
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr[i].length-1;j++)
		{
			for(int k=0;k<arr[i][j].length-1;k++)
			{
				System.out.println(arr[i][j][k]+" ");
			}
			System.out.println();
		}
		System.out.println("---------");
	}
	sc.close();
}
}

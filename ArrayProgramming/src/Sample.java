import java.util.Scanner;
public class Sample {
	public static void main(String[] args) {
		Scanner supper = new Scanner(System.in);
		System.out.print("Enter array length");
		int len = supper.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter elements in a array");
			arr[i]=supper.nextInt();
		}
		System.out.print("Enter elements in a arrauy");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}

}

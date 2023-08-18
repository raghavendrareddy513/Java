import java.util.Scanner;

public class BubbleSortApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter array Size: ");
	int []arr= new int[scan.nextInt()];
	System.out.println("Enter elements in to array:");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Eneter elements before sorting: ");
	for(int x: arr)
	{
		System.out.println(x);
	}
	BubbleSort BubbleSort = new BubbleSort();
	BubbleSort.bubbleSort(arr);
	System.out.println("Eneter elements After sorting: ");
	for(int x: arr)
	{
		System.out.println(x);
	}
}
}

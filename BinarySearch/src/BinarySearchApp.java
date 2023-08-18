import java.util.Scanner;

public class BinarySearchApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter"+arr.length+"Elements in to array : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		BinarySearch BinarySearch =new BinarySearch();
		BinarySearch.bubbleSort(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("Enter key to found Index by using Linear Search");
		int key = scan.nextInt();
		int res=BinarySearch.binarySearch(arr, key);
		if(res>=0)
		{
			System.out.println("Index found : "+res);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}

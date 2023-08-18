import java.util.Scanner;

public class SearchSortApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+"elements in to array: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter elements before Sorting: ");
		for(int x:arr)
		{
			System.out.print(x);
		}
		System.out.println();
		System.out.println("Enter choice to sort: ");
		int choice = scan.nextInt();
		SearchSort SearchSort = new SearchSort();

		switch(choice)
		{
		case 1:SearchSort.bubbleSort(arr);
				break;
		case 2:SearchSort.insertionSort(arr);
				break;
		case 3:SearchSort.selectionSort(arr);
				break;
		default:SearchSort.selectionSort(arr);

		}
		System.out.println("Enter elements after sorting: ");
		for(int x:arr)
		{
			System.out.print(x);
		}
		System.out.println();
		System.out.println("Enter key value to find index");
		int key =scan.nextInt();
		int res=SearchSort.binarySearch(arr, key);
		System.out.println("res index: "+res);
		//int res1=SearchSort.linearSearch(arr, key);
		scan.close();
	}
}

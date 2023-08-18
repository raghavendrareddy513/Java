
public class BinarySearch {
	public static void bubbleSort(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int help = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
	}
	int binarySearch(int arr[],int key)
	{
		int first=0;
		int last =arr.length-1;
		int mid = (first + last)/2;
		while(first<=last)
		{
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				return first = mid+1;
			}
			else
			{
				return last = mid-1;
			}
		}
		return -1;
		
	}
}

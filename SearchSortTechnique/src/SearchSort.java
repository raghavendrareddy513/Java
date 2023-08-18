
public class SearchSort {
	void bubbleSort(int arr[])
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
	void selectionSort(int arr[])
	{
		int min;
		int pos;
		int help;
		for(int i=0;i<=arr.length-2;i++)
		{
			min =arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					pos=j;
				}
			}
			help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
		}
	}
	void insertionSort(int arr[])
	{
		for(int i=1;i<=arr.length-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
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
	int linearSearch(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
}

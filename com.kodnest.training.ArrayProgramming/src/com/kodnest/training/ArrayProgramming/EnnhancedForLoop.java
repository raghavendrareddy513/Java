package com.kodnest.training.ArrayProgramming;

import java.util.Scanner;

public class EnnhancedForLoop {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length" );
	int arr[] = new int [scan.nextInt()];
	System.out.println("Enter the element to array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter content elements: ");
	for (int i : arr) {
		i=i+5;
		System.out.print(i+" ");
	}
	scan.close();
}
}

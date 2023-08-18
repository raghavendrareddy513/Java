package com.kodnest.training.ArrayProgramming;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Size: ");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter "+i+" element");
		arr[i]=scan.nextInt();
	}
	System.out.println("Array Contents are: ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("The "+i+" element");
		System.out.println(arr[i]+" ");
	}
	scan.close();
}
}

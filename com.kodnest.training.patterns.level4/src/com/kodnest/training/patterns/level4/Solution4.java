package com.kodnest.training.patterns.level4;

public class Solution4 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print("#");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}

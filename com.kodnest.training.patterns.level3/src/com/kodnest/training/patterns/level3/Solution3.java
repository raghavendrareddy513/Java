package com.kodnest.training.patterns.level3;

public class Solution3 {
public static void main(String[] args) {
	for(int i=5;i<=0;i--)
	{
		for(int j=5;j<=i-1;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}

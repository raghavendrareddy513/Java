package com.kodnest.training.loops;

public class Raghva {
	public static void main(String[]  args) {
		int i=1;
		do
		{
			System.out.println("I = "+i);
			i++;
			int j=1;
			do
			{
				System.out.println("J = "+j);
				j++;
			}while(j<=2);

		}while(i<=3);
	}
}
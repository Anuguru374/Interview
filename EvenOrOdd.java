package com.xworkz.tasks;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numberr");
		x=sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
			
		
	}

}

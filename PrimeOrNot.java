package com.xworkz.tasks;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String a[])
	{
		int n;
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(" is prime number" +n);
		}
		else
		{
			System.out.println("not a prime number" +n);
		}
	}

}

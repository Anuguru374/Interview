package com.xworkz.tasks;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String args[])
	{
		int n,x;
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		
		while(n>0)
		{
			x=n%10;
			sum=sum+x;
			n=n/10;
		}
		System.out.println(sum);
		
		
	}
	

}

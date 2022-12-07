package com.xworkz.tasks;

import java.util.Scanner;

public class Swap 
{
	public static void main(String args[])
	{
		int a;
		int b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the A values");
		a=sc.nextInt();
		
		System.out.println("enter the B values");
		b=sc.nextInt();
		
		System.out.println("\n value of A and B before swapping is A:" +a+ "B:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\n value of A and  B after swapping is A:"+a+" B:"+b);
		 
		
	}
}
		
	



package com.xworkz.tasks;

import java.util.Scanner;

public class LargeDigit {
	public static void main(String args[])
	{
		int max,i,n;
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n numbers");
		n=sc.nextInt();
		
		a=new int[n];
		System.out.println("enter the numbers");
		for(i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		max=max_num(a,n);
		System.out.println("the large" +max);
		
	}
	
	static int max_num(int[]a,int n)
	{
		int i;
		int m=0;
		for(i=0; i<n; i++)
		{
			if(a[i]>m)
			{
				m=a[i];
			}
		}
		return m;
	}

}

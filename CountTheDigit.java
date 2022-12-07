package com.xworkz.tasks;

import java.util.Scanner;

public class CountTheDigit {
	public static void main(String[] args) {
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
        num=sc.nextInt();
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println(count);
	}

}

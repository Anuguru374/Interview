package com.xworkz.tasks;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		
		String a,b;
		StringBuffer sb;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		
		a=sc.nextLine();
		sb=new StringBuffer(a);
		b=sb.reverse().toString();
		
		if(a.equals(b))
		{
			System.out.println(" is a palidrome");
		}
		else
		{
			System.out.println("not a polidrome");
		}

	}

}

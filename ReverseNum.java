package com.xworkz.tasks;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
	   int a,b;
	   int d=0;
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("entter a number");
	   a=sc.nextInt();
	   while(a>0)
	   {
		   b=a%10;
		   a=a/10;
		   d=(d*10)+b;
	   }
	   
	   System.out.println(d);
		

	}

}

package com.xworkz.tasks;
import java.util.Scanner;

public class RemoveSpace 
{
	public static void main(String args[])
	{
		String s1=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		s1=sc.nextLine();
		
		System.out.println("input string is" +s1);
		String s2=s1.replaceAll("\\s+","");
		System.out.println("output string is"+s2);
		
    }
}

package com.xworkz.tasks;

public class ReverseString {
		
		public static void reverce(String data)
		{
			
			char newData[]=data.toCharArray();
			
			for(int index=newData.length-1; index>=0; index--)
			{
				System.out.print(newData[index]+ " ");

			}
			
		}
		
		
		public static void main(String a[])
		{
			reverce("DEVENDRA");
			
		}

	}


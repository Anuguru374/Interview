package com.xworkz.tasks;

public class SwapAndfindLargeNum {
	
    public static int arr[]= {12,53,26,6,1};
	public int a, b;
	public static int temp;

	public static void main(String args[])
	{
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.println("assending" + arr[i]);
		}
		
		System.out.println(arr[arr.length-3]);
		
		
	}

}

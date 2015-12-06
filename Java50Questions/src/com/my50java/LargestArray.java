package com.my50java;

public class LargestArray {
	public static void largest(int[] arr)
	{
				int max = arr[0];
		for (int i=1;i<=arr.length-1;i++)
		{
		if (max < arr[i])
		{
			max = arr[i];
		}
			
		}
			System.out.println("Largest Number is "+ max);
		
	}
	
	public static void main(String[] args) {
				largest(new int[]{20,54,67,89});
		// TODO Auto-generated method stub

	}

}

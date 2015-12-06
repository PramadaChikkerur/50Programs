package com.my50java;

public class SwapNumbers2 {
	
	public void  SwapNumber(int a, int b)
	{
				int temp;
	{
		
		System.out.println("Before Value of a is " + a + "and Before Value of b is " + b);
		temp = a;
		a = b;
		b = temp;
	System.out.println("New Value of a is " + a + "and New Value of b is " + b);
	}
		}
	
	public void  SwapNumber2(int a, int b)
	{
		System.out.println("Before Value of a is " + a + "and Before Value of b is " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("New Value of a is " + a + "and New Value of b is " + b);
		
				
	}
	
public static void main(String[] args) {
	SwapNumbers2 obj = new SwapNumbers2();
	obj.SwapNumber(6, 7);
	SwapNumbers2 obj2 = new SwapNumbers2();
	obj2.SwapNumber2(10, 15);
	}
	

}

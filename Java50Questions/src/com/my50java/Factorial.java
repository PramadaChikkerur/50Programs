package com.my50java;

public class Factorial {

	public int calcFact(int num)
	{
		int fact= num;
		for (int i=num-1;i>1;i--)
		{
			fact = fact*i;
		}			
				return fact;
			}
	
	public int recurfact(int num)
	{
		if(num <= 1)
		{
			return 1;
		}
		else
		{
			return num*recurfact(num-1);
		}
	}
	
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		int Value = obj.calcFact(4);// TODO Auto-generated method stub
	System.out.println("Factorial is : " + Value);
	Factorial obj2 = new Factorial();
	int recurfactorial = obj2.recurfact(6);
	System.out.println("Factorial is : " + recurfactorial);

	}

}

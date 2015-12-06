package com.my50java;

public class ArmstrongNum {
	
	public static void isArmStrong(int n)
	{
		int sum = 0; 
		int temp;
		int remainder;
		int digits = 0;
		
		temp = n;
		while (temp !=0){
			digits++;
			temp = temp/10;
					}
		temp = n;
		
		while (temp !=0)
		{
			remainder = temp%10;
			sum = sum = power(remainder,digits);
			temp = temp%10;
								}
		
		if (n==sum)
			System.out.println(n+ "Is a Armstrong Number");
			else 
				System.out.println(n+ "Is Not a Armstrong Number");
			
					
		}
		
	static int power(int n, int r) {
	      int c, p = 1;
	 
	      for (c = 1; c <= r; c++) 
	         p = p*n;
	 
	      return p;   
	   }
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmStrong(153);
	}

}

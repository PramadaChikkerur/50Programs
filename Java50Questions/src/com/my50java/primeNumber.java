package com.my50java;

public class primeNumber {

	public static void main(String[] args) {

		System.out.println(IsPrime(24));
		
	}
	
	public static boolean IsPrime(int num) 
	
	{
		System.out.println("Prime check started for : " + num);
		for (int i=2; i<=num/2; i++){
			if (num % i == 0 ){
				
				System.out.println("Not Prime "+num);
				return false;
				
			}
			
		}
		System.out.println("Is Prime "+num);
		return true;
	
	}

	}



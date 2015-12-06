package com.my50java;
import java.util.Scanner;
public class PingPong {
	
public static void main(String[] args)
{
int num;
Scanner input = new Scanner(System.in);
	System.out.println("Enter No: ");
	num = input.nextInt();
	input.close();

{
	
		if(num%3 == 0 && num%5==0)
		{
		System.out.println("Ping Pong");
		}
		else if (num%5 ==0)
		{
			System.out.println("Pong");
		}
		else if (num%3 ==0)
		{
			System.out.println("Ping");
		}
		
		else 
		{
			System.out.println(num);
		}
}
}
}

	
	
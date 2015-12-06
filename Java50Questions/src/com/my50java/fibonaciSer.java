package com.my50java;

public class fibonaciSer {

public static void main(String[] args)
{
	int n=15, first=0, second=1, next;
	for (int i=0;i<n;i++)
	{
		if (i<=1)
			next = i;
		else 
		{
			next = first+second;
			first = second;
			second=next;
		}
	System.out.println(next);
		}		
	}	
}

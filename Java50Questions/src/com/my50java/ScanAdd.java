package com.my50java;

import java.util.Scanner;

public class ScanAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int b;
int sum;

System.out.println("Enter first integer to add:");
Scanner in = new Scanner(System.in);
a = in.nextInt();
System.out.println("Enter first integer to add:");
Scanner in1 = new Scanner(System.in);
b = in1.nextInt();
sum = a + b;
System.out.println("Sum is "+ sum);
in.close();
in1.close();
	}
}

package com.my50java;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		
		System.out.println("Enter the Command:");
		Scanner input = new Scanner(System.in);
		str = input.next();
		System.out.println("Command Entered is : " + str);
		input.close();
		
	}

}

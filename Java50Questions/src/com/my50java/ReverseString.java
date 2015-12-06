package com.my50java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String to Reverse:");
		original = in.nextLine();
		in.close();
		for (int j=0;j<original.length();j++){
			System.out.println(original.charAt(j));
					}
		int length = original.length();
		for (int i = length - 1;i>=0;i--){
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse String is: " + reverse)	;
		}
	}



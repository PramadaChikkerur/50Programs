package com.my50java;

import java.util.Scanner;

public class PalinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original, reverse= "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word to test " );
		original = in.nextLine();
		in.close();
		int length = original.length();
		
		for (int i = length-1;i>=0;i--)
			reverse = reverse+original.charAt(i);
		
		if (original.equals(reverse))
			System.out.println(original + " Is a palindrome");
		else
			System.out.println(original + " Is a not palindrome");
		
			}

}

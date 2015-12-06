package com.my50java;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My Name is Sumedha";
		StringBuffer buffer = new StringBuffer();
		
		String[] str = s.split(" ");
		for (int i = str.length -1;i>=0;i--){
			buffer.append(str[i]);
			buffer.append(" ");
		}
			
		System.out.println("Original String is "+ s);
		System.out.println("Reversed String is " + buffer.toString());
			
			
		}
	}



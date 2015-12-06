package com.my50java;

public class FindNumArr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5};
				int sum=0;
				for (int i : arr){
			sum = sum+i;
					}
int total = (arr.length + 1)*(arr.length+2)/2;
int missingnum = total - sum;
System.out.println("Missing Number is " + missingnum);
	
	}
}
	



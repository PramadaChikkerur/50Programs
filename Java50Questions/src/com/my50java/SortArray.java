package com.my50java;

public class SortArray {
	
	public static void Ascending(int[] arr){
		for (int i=1; i<arr.length;i++){
			int j = i;
			int B= arr[i];
			while ((j>0) && (arr[j-1]> B)){
				arr[j] = arr[j-1];
				j--;
							}
			arr[j]= B;
		}
		}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
				int i;
				int arr[] = {10, 13, 15, 18,16};
				System.out.println("Values Before Sorting: " );
				for (i = 0; i<arr.length;i++)
					System.out.println(arr[i]);
				Ascending(arr);
				System.out.println("Values After Sorting: " );
				for (i = 0; i<arr.length;i++)
					System.out.println(arr[i]);
	}

}

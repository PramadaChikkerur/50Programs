package com.my50java;

public class MergeArrays {
	
	public static int[] arrMerge(int[]a, int[]b){
				
		    int[] answer = new int[a.length + b.length];
		    int i = 0, j = 0, k = 0;

//		    while (i < a.length && j < b.length)
//		    {
//		        if (a[i] < b[j])       
//		            answer[k++] = a[i++];
//
//		        else        
//		            answer[k++] = b[j++];               
//		    }

		    while (i < a.length)  
		        answer[k++] = a[i++];

		    while (j < b.length)    
		        answer[k++] = b[j++];

		    return answer;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a = {4,6,7,8};
		int[]b = {1,2,3,5};
		int[]c = arrMerge(a,b);
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]+" ");
		
		

	}

}

package com.my50java;


import java.io.BufferedReader;
import java.io.FileReader;

public class CountWords {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stubystem.out.println ("Counting Words");       
	       FileReader fr = new FileReader ("C:\\Users\\pramada\\Documents\\Customer1.txt");        
	       BufferedReader br = new BufferedReader (fr);     
	       String line = br.readLine();
	     	       int count = 0;
	       while (line != null) {
	          String []parts = line.split(" ");
	          for( String w : parts)
	          {
	            count++;        
	          }
	          line = br.readLine();
	       }         
	       System.out.println(count);
	       br.close();
	    
	}
	


       
}
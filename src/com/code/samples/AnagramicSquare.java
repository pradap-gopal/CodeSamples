package com.code.samples;

public class AnagramicSquare {
	
	   public static boolean isAnagramicSquare(int n) {
		   boolean isAnagramicSquare = false;
		   
		   int sqrt = (int) Math.sqrt(n);
		   if(sqrt*sqrt == n) {
			   String reverseStr = (new StringBuilder(String.valueOf(n))).reverse().toString();
			   int reverseInt = Integer.valueOf(reverseStr);
			   sqrt = (int)Math.sqrt(reverseInt);
			   if(sqrt*sqrt == reverseInt) {
				   isAnagramicSquare = true;
			   }			    
		   }
		   
		   return isAnagramicSquare;
	        
	   }
	   
	   public static void main(String[] args) {
		   System.out.println(isAnagramicSquare(168));
		   System.out.println(isAnagramicSquare(169));
	   }

}

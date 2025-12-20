package com.code.samples;

import java.util.*;

public class BalancedString {
	

		
		public static void main(String []argh)
		{
			Scanner sc = new Scanner(System.in);
			
			while (sc.hasNext()) {
				String input=sc.next();
	            boolean isBalanced = true;
	            //Complete the code
	            char [] inputChars = input.toCharArray();
	            char [] openBrackets = {'(', '[', '{'};
	            char [] closeBrackets = {')', ']', '}'};
	            for(int i=0; i<openBrackets.length; i++){
	                boolean openBrackerFound = false;
	                int openBracketCounter = 0;
	                int closeBracketCounter = 0;
	                for(char inputChar: inputChars){
	                    if(closeBrackets[i] == inputChar && !openBrackerFound){
	                        isBalanced = false;
	                    } else if(closeBrackets[i] == inputChar){
	                        closeBracketCounter++;   
	                    }
	                    if(openBrackets[i] == inputChar){
	                        openBrackerFound = true;
	                        openBracketCounter++;
	                    }   
	                }
	                if(!isBalanced){
	                    System.out.println(false);
	                    isBalanced = false;
	                    break;
	                } else if (openBracketCounter != closeBracketCounter){
	                    System.out.println(false);
	                    isBalanced = false;
	                    break;
	                } else {
	                    isBalanced = true;
	                }
	            }
	            
	            if(isBalanced){
	                System.out.println(true);
	            }
			}
			
		}
}







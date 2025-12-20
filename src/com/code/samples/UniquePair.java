package com.code.samples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class UniquePair {
	
	/*You are given  pairs of strings. Two pairs  and  are identical if  and . That also implies  is not same as . After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.*/


	public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }

	//Write your code here
	    Set<String> pairSet = new HashSet<String>();
	    
	    for(int i = 0; i<pair_left.length; i++){
	        String pairString = pair_left[i]+","+pair_right[i];
	        pairSet.add(pairString);
	        System.out.println(pairSet.size());
	    }

	   }
	}


package com.code.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CoinChangeProblem {
	
	/*The Coin Change Problem is a classic computer science challenge 
	 * asking for the fewest coins (or total ways) to make a target 
	 * amount from given denominations, assuming infinite coins
	 */
	
	public static <Integer> int coinChange(int total, List<Integer> coins) {
        coins.sort(Collections.reverseOrder());
        Iterator<Integer> i = (Iterator<Integer>) coins.iterator();
        int reminder = 0;
        int totalCoins = 0;
        while(i.hasNext()) {
        	int largest = (int) i.next();
        	if(total/largest >=1) {
	            int count = total/largest;
	            reminder = total%largest;
	            if(reminder ==0 ) {
	            	totalCoins += count;
	            	break;
	            } else {
	            	total  = reminder;
	            	totalCoins += count;
	            }
        	}


        }
        return totalCoins;
    }
	
	public static void main(String [] args) {
		int total = 18;
		List<Integer> coins = new <Integer>ArrayList();
		coins.add(5);
		coins.add(2);
		coins.add(1);
		System.out.println(coinChange(total,coins));
	}

}

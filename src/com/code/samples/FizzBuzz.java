package com.code.samples;

import java.util.Scanner;

public class FizzBuzz {
	
	/*FizzBuzz is a classic programming challenge and word game 
	 * where you count from 1 up to a number (like 100), saying "Fizz" for multiples of 3, 
	 * "Buzz" for multiples of 5, and "FizzBuzz" for numbers divisible by both, 
	 * testing basic looping and conditional logic. 
	 */
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		for(int i=1;i<=input; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i%3 == 0) {
				System.out.println("Fizz");
			} else if(i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}		
	}

}

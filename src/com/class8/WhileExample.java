package com.class8;

import java.util.Scanner;

public class WhileExample {
// we dont know number of iterations
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/* Lets ask user to enter if it is raining or not(true or false)
		 * as long as there is rain lets keep asking
		 * as soon as there is no rain--. you can go to the park
		 */
		
		Scanner scan=new Scanner(System.in);
		boolean isRain;
		do {
			System.out.println("Is it raining");
			isRain=scan.nextBoolean();
			
		}while( isRain);
		System.out.println("Go to the park");
	}

}

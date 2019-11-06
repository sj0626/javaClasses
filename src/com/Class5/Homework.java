package com.Class5;

import java.util.Scanner;

/*Create a Java program that will ask if user has a credit card or not. 
 * If you user does not have a credit card then offer them. 
 * If they do have one ask what is balance on the card? 
 * If balance of the card is larger than 1000, 
 * tell them to pay off immediately, otherwise you can tell them that they can spend more.
 */
public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do u have a credit card or not");
		boolean cc = input.nextBoolean();
		if (cc) {
			System.out.println("What is the bal on your card");
			int balance = input.nextInt();
			if (balance > 1000) {
				System.out.println("payoff your balance");
			} else {
				System.out.println("you can spend more money");
			}
		} else {
			System.out.println("we can offer");
		}
	}

}

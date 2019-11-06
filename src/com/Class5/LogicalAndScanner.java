package com.Class5;

import java.util.Scanner;

public class LogicalAndScanner {
	public static void main(String[] args) {
		/*
		 * ask user to enter age if age is from 1-3 you are baby if age is 3-5 toddler
		 * age from 5-12 kid age 12-19 teenager if age>20 adult
		 */
		Scanner age = new Scanner(System.in);
		System.out.println("Enter age");
		int old = age.nextInt();
		if ((old >= 1) && (old <= 3)) {
			System.out.println("baby");

		} else if (old > 3 && old <= 5) {
			System.out.println("toddler");
		} else if (old > 5 && old <= 12) {
			System.out.println("kid");
		} else if (old > 12 && old <= 19) {
			System.out.println("teenager");
		} else if (old >= 20) {
			System.out.println("adult");
		}
		else {
		System.out.println("not valid");
		}
	}
}

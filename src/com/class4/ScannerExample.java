package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		//System.out.println("Please enter any number");
		//system.in is taking input from keyboard
		//this variable is type of scanner class
		//int number=scan.nextInt();
		//System.out.println("Entered number is" +" " +number);
		//double d=scan.nextDouble();
		//System.out.println(d);
		String s=scan.next();
		System.out.println("My name is" +" " +s);
		
		System.out.println("enter number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(num1+num2);
		int num3=scan.nextInt();
		int num4=scan.nextInt();
		
		System.out.println(num3*num4);
		System.out.println("Enter the quantity.");
		double cost;
		int quantity=scan.nextInt();
		if(quantity>1000)
		{
			cost=(10*quantity)/100;
			System.out.println(cost);
			
		}
		
		else
		{
			System.out.println("This is what you have to pay" +" " +quantity);
		}
		
		
	
	}

}

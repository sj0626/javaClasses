package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args)
	{
		int price;
		Scanner scan =new Scanner(System.in);
		do {
		System.out.println("Pay for coffee please");
	      price=scan.nextInt();
	     
		} while(price!=5);// no increment needed as user is entering price 
		//and loop does not have to do the incrementation
		System.out.println("Enjoy your coffee");
		
		
			
		
		
	
		}
		
	

}
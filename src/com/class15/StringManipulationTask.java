package com.class15;

import java.util.Scanner;

public class StringManipulationTask
{
	

public static void main(String[] arg)
{
	//lets ask user to enter browser
	//base on thge input we say "Your selected browser is" -------
	
Scanner scan =new Scanner(System.in);
System.out.println("Please enter browser name");
String browser=scan.nextLine();

//switch (browser.toLowerCase()) 
switch(browser.toUpperCase())
{
case"FIREFOX":
	System.out.println("Execution" +" "+browser);
	break;
case "chrome":
	System.out.println("Execution"+" " +browser);
	break;
case " ie":
	System.out.println("Execution"+" " +browser);
	break;
case "safari":
	System.out.println("Execution" +browser);
	break;
	default:
		System.out.println("Please enter valid browser");
		// check existence of other character sequence
		//contains();
		//startswith();
		//endswith();
		//get
}
}
}
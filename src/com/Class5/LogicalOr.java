package com.Class5;
import java.util.Scanner;
public class LogicalOr {
public static void main(String[] args)
{
	// 7 days week
	//if day is 2 or 4 SDLC
	//if day is 6 or 7 java
	//if day is 3 review java class
	// if day is 1 or 5 no class
	int day=6;
	//false or false is false
	if(day==2 ||day==4) {
		System.out.println("SDLC class");
	}else if(day==6 || day==7)
		// true or false is true
	{
		System.out.println("Java Class");
	}
	//false or false is false
	else if(day==1 || day==5)
	{
		System.out.println("no class");
	}
	else if(day==3)
	{
		System.out.println("review class");
	}
	else
	{
		System.out.println("not a valid day");
	}
	String day1="Monday";

	//false or false is false
	if(day1.equals("Tuesday")||day1.equals("Thusday"))
			{
		System.out.println("SDLC class");
	}else if(day1.equals("saturday")||day1.equals("Sunday"))
		// true or false is true
	{
		System.out.println("Java Class");
	}
	//false or false is false
	else if(day1.equals("Monday")||day1.equals("Friday"))
	{
		System.out.println("no class");
	}
	else if(day1.equals("Wednesday"))
	{
		System.out.println("review class");
	}
	else
	{
		System.out.println("not a valid day");
	}
	/*   ****************************
	Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”

	Prompt the user to enter person heights in inches. Person should be classified as one of the following:
	short (under 5 feet)
	medium(5 to 6 feet)
	tall (6 feet and over)*/
	
	Scanner height1=new Scanner(System.in);
System.out.println("Enter your height"); 
double hei=height1.nextDouble();
if(hei>1&&hei<5)
{
	System.out.println("Short");
}
else if(hei>5&&hei<6)
{
	System.out.println("Medium");
}
else if(hei<=12) {
	System.out.println("Tall");

	
}
else {
	System.out.println("average");
}


int dinn=6

;
if(dinn>=1&& dinn<=5)
{
	System.out.println("its weekday");
}
else if(dinn==6|| dinn==7)
{
	System.out.println("Weekend");
}
else {
	System.out.println("its not a valid day");
}
}
}

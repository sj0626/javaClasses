package com.Class5;
import java.util.Scanner;
public class LogicalOperators {
public static void main(String[] args)
{
   Scanner input=new Scanner(System.in);
   System.out.println("Is it raining");
	boolean ifrain=input.nextBoolean();
	int temp=20;
	if(ifrain&&temp>=60)
	{
		System.out.println("I will go out");
	}
	else
	{
		System.out.println("I will stay home"); 
		}
	/*if number is between 1-10--> number is small
	 * if number is between 10-100--> number is medium
	 * if number is between 100-1000--> number is large
	 any other number --> is out of range*/
		int num =200;
		//true and false--> false
		if(num>1&& num<10)
		{
			System.out.println("This is number small");
		}else if(num>=10 && num<100)
			//true and false--> true
		{
			System.out.println("The number is medium");
		}
		//true and true-->true
		else if(num>=100 && num<1000)
		{
			System.out.println("This number is large");
		}
		else
		{
			System.out.println("number is out of range");
		}
		}
		}
	



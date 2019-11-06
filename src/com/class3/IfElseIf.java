package com.class3;

public class IfElseIf {
	public static void main(String[] args)
	{
		int num1=100;
		int num2=100;
		if(num1>num2)
		{
			System.out.println("num1 is larger than num2");
			
		}
		else if(num1==num2)//comparing
			//if none of the conditions are true then only else will be executed
		{
			System.out.println("numbers are equal");
		}
		else
		{
			System.out.println("num2 is larger than num1");
		}
	int day=8;
	if(day==1)
	{
	System.out.println("its Monday");
	}
	else if(day==2)
	{
	System.out.println("its tuesday");	
	}
	else if(day==3)
	{
		System.out.println("its wednesday");
		
	}
	else if(day==4)
	{
		System.out.println("Its thusday");
	
	}
	else if(day==5)
	{
		System.out.println("Its friday");
	

	}
	else if(day==6)
	{
		System.out.println("Its saturday");
	
	}
	else if(day==7)
	{
		System.out.println("Its Sunday");
	
}
	else
	{
		System.out.println("its not a weekday");
		
		int num4=19;
		if(num4<=100)
		{
			if(num4>=10)
			{
				System.out.println("number is 2 digit");
			}
			
		}
		else if(num4<1000)
		{
			if(num4>=100) {
			System.out.println("number is 3 didgit");
			
		}
		}else if(num4<10000)
			{
			if(num4>=1000) {
				System.out.println("number is 4 digit");
			}
		}
	
	else {
		System.out.println("its just a number");
	}
	}
	}
}

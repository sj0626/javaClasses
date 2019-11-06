package com.Class5;

public class logicalNot {
	public static void main(String[] args)
	{
		boolean b1=!true;
		boolean b2=!false;
		System.out.println(b1);
		System.out.println(b2);
		boolean traffic=true;
		if(!traffic)
		{
			System.out.println("on time");
		}
		else {
			System.out.println("late");
		}
	boolean isRain=false;
	if(!isRain) {
		System.out.println("take an umbrella");
	}
	else {
		System.out.println("no umbrella");
	}
	//lets compare 2 numbers using not operator
	int num1 =10;
	int num2=11;
	if(num1==num2)
	{
		System.out.println("numbers are equal");
	}
	else {
		System.out.println("numbers are not equal");
	}
	if(!(num1==num2))
	{
		System.out.println("numbers are not equal");
	}
	else {
		System.out.println("numbers are equal");
	}
	String name="Mary";
	String name2="john";
	//true or false is true add not then false
	if(!(name.equals("Mary")||name.equals("anna")))
	{
		System.out.println("You are not my sister");
	}
	else
	{
	System.out.println("You are my sister");	
	}
	}
	

}

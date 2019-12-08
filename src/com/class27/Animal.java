package com.class27;

public class Animal {
	Animal(){
		System.out.println("hello");
	}
	
	
public static void whoAMI()//cannot overirde static methods
{
	System.out.println("Im an animal");
}}
class Monkey extends Animal
{
	
	public static void whoAMI()
	{
		System.out.println("Im a monkey");
	}
}

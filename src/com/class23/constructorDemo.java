package com.class23;

import com.class24.Constructorpractice;

public class constructorDemo {
	/*constructorDemo()
	{
		default constructor
	}*/
	constructorDemo()
	{
		System.out.println("I am your constructor");
	}
	constructorDemo(String str)
	{
		System.out.println("I'm constructor with one parameter" +" "+str);
	}
	constructorDemo(int num)
	{
	System.out.println("im constructor with int parameter" +" " +num);
	}
	constructorDemo(int num,int num1)
	{
		System.out.println("Im constructor with 2 parameters" +num  +" "+num1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructorDemo obj=new constructorDemo();
constructorDemo obj1=new constructorDemo("My Parameter");
constructorDemo obj2=new constructorDemo(123);
constructorDemo obj3=new constructorDemo(123,6);
System.out.println("code after creating object");
obj.hello();
obj.hello("hi");
	}
	 
	 
		Constructorpractice obj4=new  Constructorpractice("John","Smith");
	
		
		
public void hello()
{
	System.out.println("hello class");
	System.out.println("Hello instructors");
}
	public  void hello(String str)
	{
		System.out.println("hello class");
		System.out.println("Hello instructors");
	}
	}



package com.class29;

import com.class27.Main;

public abstract class Vehicle {
static String brand;
	Vehicle()
	{
		
	}
	public void drive() {
		System.out.println("Vehicle can drive");
	}
	
	public void stop()
	{
		System.out.println("Vehicle can stop");
	}
	public abstract void start();
	public abstract void speed();
}

 
 abstract class   Car extends Vehicle
{
	public abstract   void start();
	public  void speed() {
		System.out.println("Max car speed to 400");
	}
}
 
 class BMW extends Car
 {
	 public  void start()
	 {
		 System.out.println("BMW can start");
 }
	// public  void speed()
	 //{
	//	System.out.println("BMW speeds over 400"); 
	 
	// }
	 
	
		
	}
 

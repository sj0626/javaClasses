package com.class28;

public class Car {
	String make,model,brand;
	//without super model=null make=null
	Car()
	{
		System.out.println("I am a non argument constructor");
	}
	Car(String make,String model)
	{
	this.make=make;
	this.model=model;
	this.brand=brand;
	}

}

class Tesla extends Car
{
	boolean autopilot;
	
	Tesla()
	{
		super();//compiler will add by default to make a call to super class to intialize
		//the object
		System.out.println("I am a child not parent");
	}
	
	Tesla(String make,String model,boolean autopilot)
	{
		super(make,model);//calling constructor
		this.autopilot=autopilot;
	}
	public void displayInfo()
	{
		System.out.println("Car " +make +" "+model+" has an autopilot " +autopilot);
	}
}
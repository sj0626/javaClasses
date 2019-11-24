package com.class23;

class Car{
	 String make="Toyota";
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;


	Car(String carMake,String carModel,int doors,int speed,double carPrice)
	{
	  make=carMake;
	   model=carModel;
	 numberOfDoors=doors;
	 topSpeed=speed;
	 price=carPrice;
	}
	Car(String carMake,String carModel,int speed,double carPrice)
	{
	  make=carMake;
	  model=carModel;
	 topSpeed=speed;
	 price=carPrice;
	 numberOfDoors =4;
	}
	Car(int doors,int speed,double carPrice)
	{
	  make="unknown";
	   model="unknown";
	  topSpeed=speed;
	 price=carPrice;
	}
	Car(String carMake,String carModel,int doors)
	{
	   make=carMake;
	   model=carModel;
	 numberOfDoors=doors;
	 topSpeed=90;
	 price=0;
	}
	void display()
	{
	  System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	


public static void main(String[] args) 
{
	Car car1=new Car("Toyota","Prius",4,120,30000.0);
	Car car2=new Car("Toyota","Prius",120,300000);
	Car car3=new Car(4,120,30000);
	Car car4=new Car("Toyota","Prius",4,90,0.0);
	car1.display();
	car2.display();
	car3.display();
	car4.display();
}
}
package com.class23;

public class betterCar {
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	betterCar(String carModel,String carColor,int carSpeed,int carDoors)
	{
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
		
	}
	
public void getDetails()
{
	
	System.out.println("I build " +make +" " +model +" " +color);
	System.out.println("My car has " +doors+"doors"+" can have speed up to" +speed);
}
public static void main(String[] args) {
	make="BMW";
  betterCar bCar1=new betterCar("X5","blue" ,250,2);
  bCar1.getDetails();
}
}

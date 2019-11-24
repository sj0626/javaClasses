package com.class23;

public class carTest {

	public static void main(String[] args) {
		Cars1.make="Toyota";
		Cars1 objcar= new Cars1();
		Cars1 objcar1=new Cars1();
		Cars1 objcar2=new Cars1();
		objcar.color="black";
		objcar.model="Camry";
		objcar.doors=2;
		objcar.speed=300;
		objcar1.speed=200;
		objcar.getDetails();
		objcar1.color="white";
		objcar1.model="Highlander";
		objcar1.getDetails();
		objcar2.model="Prius";
		objcar2.color="Marron";
		objcar2.getDetails();
		betterCar bettercar1=new betterCar("Toyota", "red", 200, 2);
		bettercar1.getDetails();
		betterCar bettercar2=new betterCar("Camry","green",300,4);
		bettercar2.getDetails();
	}
}

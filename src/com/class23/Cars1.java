package com.class23;

public class Cars1 {
/*we want to build  only toyota cars
 * that will have different models and colors
 * 
 */
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	
public void getDetails()
{
	
	System.out.println("I build " +make +" " +model +" " +color);
	System.out.println("My car has " +doors +"doors"+" "+" can have speed up to" +speed);
}
}

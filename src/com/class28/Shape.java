package com.class28;

public class Shape {
int radius;

Shape(int radius)
{
this.radius=radius;	
}
}

class circle extends Shape
{
	final double pi;
	circle(double pi,int radius)
	{
		super(radius);
		this.pi=pi;
	}
	void area()
	{
		double areaOfCircle= pi*radius*radius;
		System.out.println(areaOfCircle);
	}
}
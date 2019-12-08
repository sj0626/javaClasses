package com.class28;

public class DeviceTest {
public static void main(String[] args)
{
	Apple apple=new Apple("iphone","Pro Max");
	Apple apple1=new Apple("ipad", "12 pro");
	System.out.println(apple.deviceType);
	System.out.println("----------");
	System.out.println(apple1.name);
	System.out.println("-----------");
	apple.dispaly();
	apple1.dispaly();
	//Child obj=new Child();
	//obj.callName();
	//obj.callingMethod();
	userInfo info=new userInfo(7568975, "John", "425 Pilot lane");
	info.userDetails();
	circle cir =new circle(3.14,4);
	cir.area();
	GrandChild child=new GrandChild();
	child.m1();
}
}

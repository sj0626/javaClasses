package com.class28;

public class Room extends building
{
int roomNumber;


Room(String str,int num,int roomNumber)
{
	super(str,num);
	this.roomNumber=roomNumber;//this() and super() can't be together
}
public static void main(String[] arg)
{
	Room room=new Room("Anannd Nagar",41,101);
	System.out.println(room.address +" "+room.floor +" "+room.roomNumber);
}
}

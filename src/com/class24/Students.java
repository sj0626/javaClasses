package com.class24;

public class Students {
	String name;
	String address;
	
	Students(String name,String address)
	{
	this.name=name;
	this.address=address;
	}
void displayInfo()
{
	System.out.println("The name of student is " +name +" " +" and his address is " +address);
}
public static void main(String[] args) {
	Students student1=new Students("John", "470 Woodecrest Dr PA");
student1.displayInfo();

}
}

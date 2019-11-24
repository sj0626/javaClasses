package com.class22;

public class InstanceVariables {
String name="Samir";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="John";
System.out.println(name);
InstanceVariables object1=new InstanceVariables();
object1.name="John";
System.out.println(object1.name);
InstanceVariables object2=new InstanceVariables();
System.out.println(object2.name);
	}

}

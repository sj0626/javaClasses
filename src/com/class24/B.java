package com.class24;

public class B extends A {
	
	void sum()
	{
		System.out.println("Addition method");
	}
public static void main(String[] args) {
	A obj=new A();
	System.out.println(obj.num);
	System.out.println(obj.Alpha);
	obj.info();
	A.printF();
	
}
}

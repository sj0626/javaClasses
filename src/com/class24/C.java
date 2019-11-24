package com.class24;

public class C extends B{
	void display()
	{
		System.out.println("I'm class B");
	}
public static void main(String[] args)
{
	B obj1=new B();
	System.out.println(obj1.num);
	obj1.info();
	obj1.sum();
	C obj2=new C();
	obj2.display();
	obj2.sum();
	A.printF();
}
}

package com.class24;

public class ThisKeyword {
	int a,b;
	public ThisKeyword()
	{
		System.out.println("non argument constructor");
	}
	
	public ThisKeyword(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	
	public void sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("sum of local parameters"+" " +(a+b));
		System.out.println(a+b);
	}
	public void sayA()
	{
		System.out.println(a);
	}
	public void sayB()
	{
		System.out.println(b);
	}
	public void sayAandB()
	{
		this.sayA();
		sayB();//compiler adds this automatically-->this.sayB();
	}
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(2,4);
		obj.sum(2, 7);
		ThisKeyword obj1=new ThisKeyword(20,20);
		obj1.sum(100, 200);
		ThisKeyword obj2=new ThisKeyword();
		obj2.sum(10, 0);
		obj.sayA();
		obj.sayB();
		obj2.sayA();
		obj.sayAandB();
	}

}

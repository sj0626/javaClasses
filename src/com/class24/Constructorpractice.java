package com.class24;

public class Constructorpractice {
String Name;
String LastName;
int num;
int num1;
char A;

Constructorpractice()
{
	System.out.println("Constructor is default");
}
 public Constructorpractice(String personName,String lName)
{
	System.out.println("public constructor");
	Name=personName;
	LastName=lName;
}
 
 private Constructorpractice( int a ,int b)
 {
	 System.out.println("private constructor");
	 num=a;
	 num1=b;
 }
 protected Constructorpractice(char a,String b)
 {
	 A=a;
	 Name=b;
	 System.out.println("protected constructor");
 }
 void display()
 {
	 System.out.println(Name+" "+LastName);
	 System.out.println(num1+" "+num);
	 System.out.println(A+" "+Name);
 }
 
 public static void main(String[] args) {
	Constructorpractice obj=new Constructorpractice();
	Constructorpractice obj1=new  Constructorpractice("John","Smith");
	Constructorpractice obj2=new Constructorpractice(24,67);
	Constructorpractice obj3=new Constructorpractice('c',"Mary");
	obj.display();
	obj1.display();
	obj2.display();
	obj3.display();
}
}

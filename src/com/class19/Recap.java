package com.class19;

public class Recap {
int sum(int num1,int num2)
{
	int c=num1+num2;
	return c;
	
}
///create a method to display hello 5 times
//create a method to say something  # numnber of times
void saySomething(String word,int times)
{
	for(int i=0;i<times;i++)
	{
		System.out.println(word);
	}
}
void sayHello(int times)
{
	for(int i=0;i<times;i++)
	{
		System.out.println("Hello");
	}
}
public static void main(String[] args)
{
	Recap obj=new Recap();
	obj.sum(10, 30);
	obj.sayHello(5);
	System.out.println("-----------------");
	obj.saySomething("Hello", 20);
}
}

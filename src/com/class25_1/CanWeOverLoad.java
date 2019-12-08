package com.class25_1;

public class CanWeOverLoad {
private void methodOne()

{
	System.out.println("I am method one");
}
private void methodOne(String str)
{
	System.out.println("I am method with str");
}
//can we overload main method-->yes
// can we overload sttaic method-->yes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am a main method with String array");
main("hello");
String [] array= {"A","B"};
main("Hello",array);
	}
	public static void main(String str)
	{
		System.out.println("Im a main method with String arguments");
	}
public static void main(String str ,String [] arg)
{
	System.out.println("I'm a main method with 2 parameters");
}
}

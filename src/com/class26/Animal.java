package com.class26;

public class Animal {
public void sleep()
{
	System.out.println("Animal sleep");
}
public void eat()
{
	System.out.println("Animal eat");
}
}

class Cat extends Animal
{
	public void sleep()
	{
		System.out.println("cat sleep all day");
	}	
	public void meow() {
		System.out.println("I mewo when I'm hungry");
	}
		public void eat()
		{
			System.out.println("Cat eat mouse");
	}
}

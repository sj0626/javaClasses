package com.class18;

public class Hello {
	void sayHello(String name)
	{
		System.out.println("Hello" +name);
	}
public static void main(String[] args)
{
	
	Hello obj=new Hello();
	obj.sayHello("Shubha");
	obj.sayHelloDifferentLanguage("Paraguay");
	obj.sayNameAndAge("John", 25);
	obj.isSnowing(false);
	/////Create a method gthat will say hello in different language baed
	/////on the value that will be passed when user calls a method
	
}
////////////////////////////////create a method that will 
/*check if its snow-stay home
 * otherwise go for a walk
 * 
 */
void isSnowing(boolean isSnowing)
// method body
{
	
	if(isSnowing)
	{
		System.out.println("Stay Home");
	}
	else
	{
		System.out.println("Go for a walk");
	}
}
void sayHelloDifferentLanguage(String  country)
{
	
	switch(country.toLowerCase()) {
	case "USA":
	System.out.println("HELLO");
	break;
	case "russia":
	System.out.println("Privet");
	break;
	case "paraguay":
		System.out.println("Hola");
		break;
	case "albania":
		System.out.println("Pershendetje");
		break;
		default:
			System.out.println(" I dont know");
	}
}

/////////method to say name and age
void sayNameAndAge(String name,int age)
{
	System.out.println("My name is" +" " +name +" "+"and I am  " +age +"  years old");
}
}

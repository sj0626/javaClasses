package com.Class10;

public class GetAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
for(int i=0;i<animals.length;i++)
{
	if(animals[i].contentEquals("Dog"))
	{
		System.out.println("I Love Dogs ");
	}else
	{
		System.out.println(animals[i]);
	}
}
//Create an array of countries. While retrieving all values from an array 
//print capital for each country.
	
	
	String[] Country= {"India" ,"China", "Pakistan" ,"USA"};
	
	for(int i=0;i<Country.length;i++)
	{
		if(Country[i].equals("India"))
		{
			System.out.println("Delhi");
		}else if(Country[i].equals("China"))
		{
			System.out.println("Beijing");
	}else if(Country[i].contentEquals("Pakistan"))
	{
		System.out.println("Karachi");
	}else
	{
		System.out.println("Washington");
	}

}
	for(int i=0;i<Country.length;i++)
	{
		switch(Country[i])//Switch(Afghanistan)
		{
		case "India":
			System.out.println("Delhi");
		break;
		case "China" :
			System.out.println("Beijing");
			break;
		case "Pakistan":
			System.out.println("Karachi");
		case "USA":
			System.out.println("Washington");
			break;	
		}
	}
}
}

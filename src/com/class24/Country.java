package com.class24;

public class Country {
 public String capital,name;
 public int population;
/* Country (String countryName,String countryCapital,int countryPopulation)
 {
	 name=countryName;
	 capital=countryCapital;
 }*/
 Country(String name,String capital,int population)
 {
	 this.name=name;
	 this.capital=capital;
	 this.population=population;
 }
 Country()
 {
	 System.out.println("no parameters");
 }
 void display()
 {
	 System.out.println(name+" " +capital +" "+population);
 }
 public static void main(String[] args)
 {
	 Country country1=new Country("USA","Washington D.C.",5000);
	 Country country2=new Country();
	 country1.display();
	 country2.display();
	 System.out.println(country1.name);
	/* Constructorpractice obj=new Constructorpractice();
	 
		Constructorpractice obj1=new  Constructorpractice("John","Smith");
	
		Constructorpractice obj3=new Constructorpractice('c',"Mary");
		obj.display();
		obj1.display();
		
		obj3.display();*/
 }
}

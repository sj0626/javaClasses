package com.class23;

public class Dog {
	
		  
		 String dogName;
		double dogWeight;   
		static String dogBreed="Mutt";

		Dog(String Name,String breed,double weight)
		{
		  dogWeight=weight;
		  dogName=Name;
		  
		}
		Dog(String Name,double Weight)
		{
		  dogName=Name;
		  dogWeight=Weight;
		}
		void display()
		{
		  System.out.println(dogName+" "+dogBreed+" "+dogWeight);
		}
		

public static void main(String[] args) {
    Dog doggy=new Dog("Tarzan","Mutt",50.0);
    Dog doggy1=new Dog("Tarzan",50.0);
    doggy1.display();
    doggy.display();
  }
}
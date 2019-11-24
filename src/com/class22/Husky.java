package com.class22;

public class Husky {
static String breed="Husky";//sttaic variables have same value for all the objects and tehy belong to class but not to any object
static int paws=4;
static int tail=1;
String color;
String name;
void display()
{
	System.out.println("Puppy name is " +name +" " +"and breed is  " +breed);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		breed="Bull Dog";
Husky dog=new Husky();
dog.color="brown";
dog.name="Bruno";
dog.display();
Husky dog1=new Husky();

dog1.name="Ruby";
dog1.color="white";
dog1.display();
Husky dog2= new Husky();
dog2.name="Dan";
dog2.color="grey";
breed="Pomerian";
dog.display();
dog1.display();
dog2.display();

	}

}

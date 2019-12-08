package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//widening
double d=90;
// narrowing
int i=(int)1.99;
 Animal obj=new Cat();//assignning the child to parent reference called upcasting
 // widening--. creating an object of the class and giving reference to the Parent class
 // narrowing 
  Cat obj2=(Cat) new Animal();
  Animal obj1=new Animal();
  // creating the object of Animal class
  obj1.sleep();
  obj1.eat();
  Cat obj3=new Cat();
  obj3.eat();
  obj3.meow();
  obj3.sleep();//from child
  obj2.eat();
  obj.eat();
  obj.sleep();
  
	}

}

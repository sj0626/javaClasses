package com.class24;

public class ThisWithConstructor {

	ThisWithConstructor() {
		this(10);
		System.out.println("I am non argument constructor");
	}

	
	ThisWithConstructor(int a)// constructor2
	{
		this("word","Bye");
		System.out.println("int parameter");
	}

	ThisWithConstructor(String word, String word1)// cconstructor4
	{		System.out.println("Two parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisWithConstructor obj = new ThisWithConstructor();
		// ThisWithConstructor obj1 = new ThisWithConstructor();
//can we execute 2 constructors when creating an Object at the same time
//yes-it can be achieved using this()
	}

}

package com.class15;

public class StringManipulationclass {
	public static void main(String[] args)
	{
		String str="HeLLO";
		String str1=	new String("hello");
		/// second way of declaring a string by creating an object string typestr.
System.out.println(str);
System.out.println(str1);
// Inside string class we have many methods that can be performed on strings
// find number of characters in a string .length()
// case conversion/functions
System.out.println(str.length());
System.out.println(str.toLowerCase());//
str=str.toLowerCase();
System.out.println(str);
str=str.toLowerCase().toUpperCase();
System.out.println(str);
// verify if there if the string is Empty
String myString="";// string is empty
boolean isEmpty=myString.isEmpty();
System.out.println(isEmpty);
//String myString1=null;// string has no value we have assigned null value
//String myString1;
//System.out.println(myString1.isEmpty());
// how to verify existence of characters  in the string
String a="Good evening students";
boolean exist=a.contains("students");
boolean exist1=a.contains("student");
System.out.println(exist);	
System.out.println(exist1);
System.out.println(a.startsWith("Good"));
System.out.println(a.startsWith("student"));
}
}
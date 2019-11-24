package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello";
str=str.replace("Hello", "Hi");
System.out.println(str);
Scanner scan=new Scanner(System.in);
String scannerString=scan.nextLine();
System.out.println(scannerString);
BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
obj.myMethod();
	}

void myMethod()//
{
	System.out.println("This is user defined method");
}
	}


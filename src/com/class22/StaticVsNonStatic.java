package com.class22;

public class StaticVsNonStatic {
//template for a school(school,name,grade
	static String school="Syntax";
	String name;
	char grade;
	void getInfo()//instance method
	{
		System.out.println("My name is  "+name +" " +"and my grade is "
	+grade +"  and I am going to this school  " +school);
	}
	 static void getInfo1()
	{
		System.out.println("I am attending classes at " +school);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVsNonStatic info= new StaticVsNonStatic();
info.name="John";
info.grade='A';
info.getInfo();
getInfo1();
System.out.println(school);
	}

}

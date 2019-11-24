package com.class22;

public class TestStaticvsNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(StaticVsNonStatic.school);
StaticVsNonStatic.getInfo1();
StaticVsNonStatic obj=new StaticVsNonStatic();
obj.name="John";
obj.grade='A';
obj.getInfo();

	}

}

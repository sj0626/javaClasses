package com.class27;

public class Student {
	 
	void displayInfo()
	{
		System.out.println("Im student");
	}
	void research()
	{
		System.out.println("Im at research");
	}

}

class syntaxStudent extends Student
{
	void displayInfo()
	{
		System.out.println("Im student at Syntax");
	}
	void course()
	{
		System.out.println("I'm an automation testing class student");
	}
}


class collegeStudent extends Student
{
	void displayInfo()
	{
		System.out.println("I'm student at Viriginia University");
	}
	void Graduate()
	{
		System.out.println("I'm doing my graduation");
	}
}
class schoolStudent extends Student
{
	void displayInfo()
	{
		System.out.println("I'm student at Emerald Heights School");
	}
	 void getGrade()
	 {
		 System.out.println("I'm in grade 7th");
	 }
}
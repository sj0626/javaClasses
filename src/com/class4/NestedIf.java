package com.class4;

public class NestedIf {
	public static void main(String[] args) {
		boolean b = true;
		boolean classToday = false;
		if (b) {
			System.out.println("Hello");
			if (classToday) {
				System.out.println("Hello my friends");
			}

		} else {
			System.out.println("bye");

		}
		System.out.println("i am coding");
		boolean isFriday = true;
		int day = 13;
		if (isFriday) {
			System.out.println("Today is Friday");
			if (day == 13) {
				System.out.println("I ma going to watch horror");
			} else {
				System.out.println("I will watch comedy");
			}
		} else {
			System.out.println("today is not Friday");

		}
		int age = 55;
		if (age < 16) {
			System.out.println("too young to drive");
		} else {
			System.out.println("You are eligible to drive");
			if (age >= 18) {
				System.out.println("you can get driver license");
			} else {
				System.out.println("you can get learners permit");
			}
		
			
		}
boolean quiz=false;
int score=20;
if(quiz) {
	System.out.println("Good Job");
	
		if(score>=90)
		{
			System.out.println("A");
		}
		else if(score>80) {
			System.out.println("B");
			
		}
		else {
			System.out.println("study more");
		}
}
else
{
	System.out.println("not good");

}

boolean diploma=false;
double GPA=2.5;
if(diploma) {
	System.out.println("Congratulations");
	if(GPA>=3.5)
	{
		System.out.println("yOU ARE ELIGIBLE  FOR SCHLORSHIP");
	}
	else {
		System.out.println("You should have studied harder");
	}
}
else {
	System.out.println("Get a degree");
}
double mortgage_rate=2.5;
long price=200000;
if(mortgage_rate>4.5) {
	System.out.println("User will not buy a house");
	
	}

else {
	System.out.println("buy house");
	if(price<200000)
	{
		System.out.println("User will take a loan");
	}
	
	else {
		System.out.println("Will pay cash");
	}
	
}

	}
	}


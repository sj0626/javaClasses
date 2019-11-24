package com.class19;

public class Task {
	String email(String userName,String lastName , String emailType )
	{
		String email=userName+lastName+emailType;
		return email;
	}
int primeOrNotPrime(int num)
{
	if(num%2!=0)
	{
		System.out.println("num is prime");
	}else if(num==2)
	{
		System.out.println("num is prime");
	}else
	{
		System.out.println("num is not prime");
	}
	return num;
}
	char getGrade(int score )
	{
		char grade ;
		if(score>90)
		{
	grade='A';
	
			
		}
		else if(score>80 && score<90)
		{
			grade='B';
			
		}else if(score>70 && score<80)
		{
			grade='c';
			
		}else if(score>50 && score<70)
		{
			grade='D';
		}else {
			grade='f';
		}
		return grade;
	}
}


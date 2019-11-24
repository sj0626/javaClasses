package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//find the largest  from 300 and 500
	//	then identify is the largest is odd
		
		
		AllMethods obj=new AllMethods();
		int large=obj.findLargest(300,500);
		System.out.println(large);
		boolean cond =obj.isOdd(large);
		System.out.println(cond);
		/*call method weekdayname
		 * if(tuesday,wednesday,thusday)
		 * it should print--I am learning java
		 * 
		 */
		String Day=obj.weekDayName(6);
		if(Day.equals("Tuesday")||Day.equals("Wednesday")||Day.equals("Thusday")||Day.equals("Saturday")||Day.equals("Sunday"))
		{
			System.out.println("We are learning Java");
		}
		else
		{
			System.out.println("We are staying at home");
		}
		Task obj1=new Task();
	int num=	obj1.primeOrNotPrime(4);
	System.out.println(num);
	String email=obj1.email("John", "Mary" ,"@gmail.com");
	System.out.println(email);
	char grade=obj1.getGrade(95)	;
	System.out.println(grade);
		
	}

}

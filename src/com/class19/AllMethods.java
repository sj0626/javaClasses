package com.class19;

public class AllMethods {
//create methods
	//addition
	//substraction//
	//multiplication
	//divisiond a
	
	int addition(int num1,int num2)
	{
		int result=num1+num2;
		return result;
	}
	
	int substraction(int num1,int num2)
	{
		int sub=num1-num2;
		return sub;
	}
	int division(int num1,int num2)
	{
		int result=num1%num2;
		return result;
	}
	int mult(int num1,int num2)
	{
		int result=num1*num2;
		return result;
	}
	boolean isOdd(int num)
	{
		boolean isOdd;
		if(num%2!=0)
		{
			isOdd=true;
		}
		else {
			isOdd=false;
		}
		return isOdd;
	}
	int findLargest(int num1,int num2)
	{
		int largest;
		if(num1>num2)
		{
			largest=num1;
		}
		else
		{
			largest =num2;
		}
		return largest;
	}
	/** method will take a day number 
	 * and return a week day name
	 * 
	 * @param args
	 */
	String weekDayName(int weekDay)
	{
		String weekDayName;
		switch (weekDay)
		{
		case 1:
		weekDayName="Monday";
		break;
		case 2:
			weekDayName="Tuesday";
			break;
		case 3:
			weekDayName="Wednesday";
			break;
		case 4:
			weekDayName="Thusday";
		case 5:
			weekDayName="Friday";
			break;
		case 6:
			weekDayName="Saturday";
			break;
		case 7:
			weekDayName="Sunday";
			default:
				weekDayName="unknown";
		}
		return weekDayName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

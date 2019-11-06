package com.Class5;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7 weekdays if day==1 monday if day==2 tuesday
		 * 
		 */
		int day = 6;
		String Weekday = "a";
		switch (day) {
		case 1:
			Weekday = "Monday";
			break;
		case 2:
			Weekday = "Tuesday";
			break;
		case 3:
			Weekday = "Wednesday";
			break;
		case 4:
			Weekday = "Thusday";
			break;
		case 5:
			Weekday = "Friday";
			break;
		case 6:
			Weekday = "Saturday";
			break;
		case 7:
			Weekday = "Sunday";
			break;
			default:
				Weekday="Invalid";
		}
		System.out.println(Weekday);
		
	}

}

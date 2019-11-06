package com.Class5;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* where are they from
 * based on country we will specify fav food
 * 
 */
		String Country, foodName;
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("enter your country");
		Country=scan.nextLine();
	switch(Country) {
	case "Turkey":
		foodName="Baklava";
		break;
		
	case "Ethiopia":
		foodName="Tibs";
		break;
	case "Morocco":
		foodName="Tajjin ";
		break;
	
	case "Kazakhstan":
		foodName="kumis";
		break;
		default:
			foodName="food";
	}
	System.out.println("You are from" +" " +Country +" " + "and your fav food is" +" "  +foodName);
	}
	

}

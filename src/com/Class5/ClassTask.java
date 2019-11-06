package com.Class5;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Mausam="a";
Scanner month=new Scanner(System.in);
System.out.println("Enter month");
String season=month.nextLine();
if(season.equals("Jan")||season.equals("feb")||season.equals("dec"))
{
	Mausam="Winter";
	
}
else if(season.equals("Mar")||season.equals("April")||season.equals("May"))
{
	Mausam="Spring";
}
else if(season.equals("July")||season.equals("june")||season.equals("August")) 
	{
		Mausam="Summer";
	}
	else if(season.equals("SEPt")||season.equals("Oct")||season.equals("Nov"))
	{	
		Mausam="fall";
	}
	else
	{
		System.out.println(Mausam);
	}
System.out.println("You were born in" +" " +season +"  " +"and the mausam is" +" " +Mausam);
} 
}
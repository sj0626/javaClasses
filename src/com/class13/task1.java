package com.class13;

import java.util.Scanner;

public class task1 {
	public static void main(String[] arg)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your class day:: ");
		String day=scanner.nextLine();
		 String day1=day.toLowerCase();
		if(day.trim().toLowerCase().equals("saturday"))
			//method chaining
		{
			System.out.println("Saturday is your Java Class");
		}else if(day.equalsIgnoreCase("sunday"))
		{
			System.out.println("Sunday is your Git Class");
		}else if(day.toUpperCase().equals("TUESDAY"))
		{
			System.out.println("Tueday is your SDLC class");
		}
		else if(day1.equals("thusday"))
		{
			System.out.println("Thusday is your Manual Testing class");
		}else
		{
			System.err.println("Invalid Entry!! Please enter a valid class day");
		}
		scanner.close();
		
		
	}

}

package com.Class5;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years you worked");
		int workedYears=input.nextInt();
		
		if(workedYears>=5)
		{
			System.out.println("you are eligible for bonus");
			System.out.println("Enter the salary");
			int Sal=input.nextInt();
			if(Sal>=50000)
			{
				System.out.println("you get bonus of 5000" +" " +(Sal+5000));
			}
			else {
				System.out.println("you get bonus of 3000" +" " +(Sal+3000));
			}
		}
		else
		{
			System.out.println("not eligible for bonus");
		}
	}

}

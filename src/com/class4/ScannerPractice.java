package com.class4;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k =new Scanner(System.in);
		System.out.println("Please enter the number");
	int num1=k.nextInt();
	System.out.println("Please enter second number");
	int num2=k.nextInt();
	if(num1>num2)
	{
		System.out.println(num1 +" " +"is larger then" +num2);
	}
		else if(num1==num2) {
			System.out.println("numbers are equal");
		}
	
	else
	{
		System.out.println(num1 +" " +"is smaller then "+" " +num2);
	}
	Scanner l =new Scanner(System.in);
	System.out.println("Enter the amount of loan");
	int amount=l.nextInt();
	System.out.println(amount);
	if(amount<200000)
	{
		System.out.println("You are eligible for loan");
	}
	else
	{
		System.out.println("loan rejected");
	}
	Scanner age =new Scanner(System.in);
	System.out.println("enter your age");
	int agelimit= age.nextInt();
	System.out.println(agelimit);
	if(agelimit>18)
	{
		System.out.println("eligible for driver license");
	}
	else {
		System.out.println("learners license");
	}
	Scanner city =new Scanner(System.in);
	System.out.println("enter the name of city");
	String cityname= city.nextLine();
	System.out.println(cityname);
	Scanner temp =new Scanner(System.in);
	System.out.println("enter the temperature in Faher");
	int Tempt= temp.nextInt();
	int tempt2=(((Tempt-32)*5)/9);
	System.out.println("The temperature of the" +" " +cityname +" " +"is" +tempt2);
	Scanner name=new Scanner(System.in);
	System.out.println("Please enter First Name");
	String Firstname=name.next();
	System.out.println(Firstname);
			
	Scanner age1=new Scanner(System.in);
	   System.out.println("Enter your age");
	   int AgeOld=age1.nextInt();
	   System.out.println("Your age after 10 years is" +" " +(AgeOld)+10);
	   Scanner decide=new Scanner(System.in);
	    System.out.println("Input the boolean value");
	    boolean mind=decide.nextBoolean();
	    System.out.println("The value is" +" " +mind);
	   
	    Scanner senten=new Scanner(System.in);
	    System.out.println("Type a sentence");
	    System.out.println(senten.nextLine());
	  	Scanner attri= new Scanner(System.in);
	    System.out.println("Please enter the length");
	    int length=attri.nextInt();
	    System.out.println("Please enter the Width");
	    int Width=attri.nextInt();
	    if(length==Width)
	    {
	      System.out.println("The shape of your object is square");
	    }
	    else{
	      System.out.println("The shape of your object is rectangle");
	    }
	
	
	
	
	}

}

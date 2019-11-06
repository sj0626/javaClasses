package com.Class5;

import java.util.Scanner;

public class beverage {
	public static void main(String[] args)
	{
	
		    Scanner input=new Scanner(System.in);
		      System.out.println("Are you thirsty");
		      boolean Thirsty=input.nextBoolean();
		      System.out.println("Are you sleepy");
		      boolean Sleepy=input.nextBoolean();
		      String Beverage="a";
		      if((Thirsty)&&(!Sleepy))
		      {
		        Beverage="Water";
		      }
		      else if((Thirsty)&&(Sleepy))
		      {
		        Beverage="Coffee";
		      }
		      else if((!Thirsty)&&(!Sleepy))
		      {
		        Beverage="Tea";
		        
		      }
		      else{
		        Beverage="Nothing";
		      }
		      System.out.println("Looks like you need" +" " +Beverage);
		  }

		
	}



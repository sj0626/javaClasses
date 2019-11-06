package com.Class5;

import java.util.Scanner;

public class task6 {
	
		public static void main(String[] args)
		  {
		    Scanner scan=new Scanner(System.in);
		   
		    String gender=scan.nextLine();
		    int age=24;
		    if(age>25)
		    {
		      if(gender.equals("M"))
		      {
		        System.out.println("Man");
		      }
		      else if(gender.equals("F"))
		      {
		         System.out.println(" Woman");
		      }
		    }
		    if(age<25) {
		    	
		    	if(gender.equals("M"))
			      {
			        System.out.println("Boy");
			      }
			      else if(gender.equals("F"))
			      {
			         System.out.println("girl");
			      }
		    }
		  }
		
	}



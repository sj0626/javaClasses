package com.class8;
import java.util.Random;
import java.util.Scanner;

public class NestedIfLoopExample4 {
	 public static void main(String[] args)
	 {
		 Random rand=new Random();
		 Scanner scan=new Scanner(System.in);
		 int num=0;
		 int num1= rand.nextInt(20);
		 while(num!=num1)
		 {
			 
			 System.out.println("Enter number between 1 & 20");
			 num=scan.nextInt();
			 if(num>num1)
			 {
				 System.out.println(" the number  you entered is greater");
			 }
			 else if(num<num1)
			 {
				 System.out.println("The number you entered is smaller");
			 }
	 }
System.out.println("Congratulations");
}
}
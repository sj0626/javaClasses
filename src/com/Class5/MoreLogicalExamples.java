package com.Class5;

import java.util.Scanner;
//CTRL+SHIFT+O shortcut for importing scanner
public class MoreLogicalExamples {
public static void main(String[] args)
{
	/*ask your daily sales
	 * based on the sales we wantb to give commission to gthe salesman
	 * if sale is less then 100--> commission  is 10%
	 * if sales is between 100-200-->commission 20%
	 */
	Scanner scan=new Scanner(System.in);
			System.out.println("Enter the sales");
			double commission  ;
	double sales=scan.nextDouble();
	if(sales<100)
	{
		 commission=sales*0.1;
	}
	else if(sales>=100 &&sales<=200)
	{
		commission=sales*0.2;
	}
	else {
		System.out.println("no commission");
		
	}
	System.out.println("based on you commission" +" " +commission);
}
}

package com.class8;

import java.util.Scanner;

public class newItem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++)
		{
			if((i%3==0)) {
				
			
			continue;
		}
System.out.println(i);
	}
System.out.println("***********");
/*Scanner scan=new Scanner(System.in);
for(int i=1;i<=4;i++)
{
	System.out.println("Apply for credit card");
	boolean isTrue=scan.nextBoolean();
	
	if(isTrue)
	{
		System.out.println("Stop asking");
		break;
	}
	
}*/

Scanner scan=new Scanner(System.in);
System.out.println("Enter number");
int num=scan.nextInt();
for(int c=1;c<=10;c++)
{
	 int num1=num*c;
	System.out.println(+num +" " +"*" +" "+c+" " +"=" +" " +num1);
}
	}
}

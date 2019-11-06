package com.class8;

import java.util.Scanner;

public class ForLoopExample extends WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number");
		int num1=scan.nextInt();
		for(int num=1;num<=10;num++)
		{
			
			int mult=num1*num;
			System.out.println(+num1  +"*" +num +"=" +mult);
		}

		
		for(int a=1;a<=100;a++)
		{
			System.out.print(a +" ");
		}
		for(int b=100;b>=1;b--)
		{
			System.out.println(b);
		}
		for(int c=0;c<=50;c+=5)
		{
			System.out.println(c);
		}
System.out.println("*********");		
		for(int i=20; i>=1; i--)
		{
		if(i%2==0)
		{
		System.out.println(i);
		}
		
			
			
		}
		System.out.println("*****");
	for(int i=20;i>=2;i-=2)	
	{
		System.out.println(i);
	}
			
for(int i=21;i<=50;i+=2)
{
	System.out.println(i);
}
System.out.println("***************");
for(int i=21;i<=50;i++)
{
	if(i%2!=0)
	{
	System.out.println(i);
}
}
}
}
package com.class8;

import java.util.Scanner;

public class javaloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter first num");
int start=input.nextInt();
System.out.println("Enter second number");
int end=input.nextInt();
int even=0;
int odd=0;
for(int i=start;i<=end;i++)
{
	if(i%2==0)
	{
		even=even+i;
		
	}
	else
	{
		odd=odd+i;
	}
}
System.out.println(even);
System.out.println(odd);
	}

}

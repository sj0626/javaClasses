package com.class8;

import java.util.Scanner;

public class NestedIfLoopExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter start number");
		int FirstNumber=scan.nextInt();
		int SecondNumber=scan.nextInt();
		int start = 0;
		int end = 0;
		if(FirstNumber < SecondNumber)
		{
			start = FirstNumber;
			end = SecondNumber;
		}
		else
		{
			start = SecondNumber;
			end = FirstNumber;
		}
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
			
		}System.out.println(even);
		System.out.println(odd);
	}

}

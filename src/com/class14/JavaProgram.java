package com.class14;

import java.util.Scanner;

public class JavaProgram 
{
	// write a program to swap numbers  without using temporary variable
	public static void main(String[] arg)
	{	
		int x=10;
		
		int y=20;
		x=x+y;//30
		y=x-y;//20
		x=x-y;//30-20=10
		System.out.println(x);//10
		System.out.println(y);//20
	
		
		String a="hello";
		String b="bye";
		a=a+b;
		b=(a.substring(0,a.length()-b.length()));//b=0, 5//hello
		a=a.substring(b.length());//5//bye
		System.out.println(b);
		System.out.println(a);
	
		//////////////////////////////
		String str1="Sunday";
		String reverse="";
				for(int i=str1.length()-1;i>=0;i--)
				{
				reverse=reverse + str1.charAt(i)	;
				System.out.println();
				}
				System.out.println(reverse);
				/////////////////////////////
				String str4="Sunday";
				System.out.println(str4.substring(0,3));
				System.out.println(str4.length());
				//////////////////////////////////////////////////////////////////////////////////
				int num=2;
			if((num%2!=0) &&  (num%num==0))
			{
				System.out.println("number is prime");
			}
				else if(num==2)
				{
					System.out.println("its a prime number");
				}
			
			else {
				System.out.println("number is not prime");
			}
		
			//////////////////////////////////////////////////////
			int e=0;int d=0; int c=1;
			for(int i=0;i<=10;i++)
			{
				System.out.println(c);
				d=e;//d=0,1,1,2
				e=c;//e=1,1,2,3
				c=d+e;//c=1,2,3,5
			}
				////////////////////Palindrome
				int numb=121;
				int rev=0;
						int remainder;
						int temp=numb;
						while(temp!=0)
						{
							remainder=temp%10;//1//2
							rev=rev*10+remainder;////
												temp=temp/10;//12 1
						}System.out.println(rev);
				if(rev==numb)
				{
					System.out.println("number is palindrome");
				}else
				{
					System.out.println("Not Palindrome");
				}
		
			////////////////////////////////////////
				 int[][] array = { {4,7,8},{8,8,7} };
		         int count=0;
		    for(int i=0;i<array.length;i++)
		    {
		        for(int j=0;j<array[0].length;j++)
		        {
		            if(array[i][j]==7)
		            {
		                count=count+i;
		                }
		            } 	
		        	
		           
		    }
		    System.out.println(count);
		    }
}
		



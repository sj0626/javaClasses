package com.class18;

import java.util.Scanner;

public class ClassandMethodTask {
	
	void checkNum(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a +" " +"is greater");
		}
		else if(a==b)
		{
			System.out.println("numbers are equal");
		}
		else
		{
			System.out.println(b +" " +"is greater");
		}
	}
	public static void main(String[] arg)
	{
		ClassandMethodTask num=new ClassandMethodTask();
		num.checkNum(45, 35);
		num.evenOdd(12);
		num.Palindrome("mom");
	}
/*
 * Print even or odd
 * 
 */
	void evenOdd(int num)
	{
		
		if(num%2==0)
		{
			System.out.println(num + " is even");
		}
		
		else
		{
			System.out.println(num +" is odd");
		}
		
		
	}
	
	void Palindrome(String word)
	{
		
		String reversed="";
		for(int i=word.length()-1;i>=0;i--)
		{
			reversed= reversed+word.charAt(i);
		}
		System.out.println(reversed);
		if(word.equals(reversed))
		{
			System.out.println(word +" is palindrome");
		}
		else
		{
			System.out.println(word +" is not palindrome");
		}
	}
}		
		
	
	


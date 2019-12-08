package com.class25_1;

public class Programming {
 public static String language="Language";
	
 Programming()
 {
	 System.out.println("I love all programming languages");
 }
	Programming(String str)
	{
		if(str.equals("Language"))
		System.out.println("I love all programming languages");
		else
		{
			System.out.println("I love java");
		}
	}
	
	public static void main(String[] args) {
		Programming obj=new Programming();
		
	}
}

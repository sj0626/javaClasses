package com.class13;

public class Recap1 {
	public static void main(String[] arg)
	{
		String city="Fairfax";
		String city1="FAirfax";
		System.out.println(city1.length());
		int [] a= {12,23,45,56};
		String newCity=city.toUpperCase();
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Bye");
		String str4=new String("Bye");
		System.out.println(str1.contentEquals(str2));//true
		System.out.println(str3.contentEquals(str4));
		System.out.println(str3==str4);
		//str3 is not pointing to same "bye"
		
		String str6= "  It is  Sunny   ";
				System.out.println(str6.trim());
				String str7="Tommorrow we will be done with String manipulation";
				System.out.println(str7.indexOf('e'));
				System.out.println(str7.indexOf('e',11));
				
				System.out.println(str7.indexOf('E'));
				//character not there it will give -1
				System.out.println(str7.indexOf("we"));
	}

}

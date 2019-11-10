package com.class15;

public class StringMoreExamples {
	public static void main(String[] arg)
	{
		String str="Syntax Technologies Inc";
		char letter=str.charAt(5);//one specfic character is returned at specific condition or specified index
		System.out.println(letter);
		// length=18
		//System.out.println(str.charAt(str.length()));
		
		System.out.println(str.charAt(str.length()-1));
		// get a substring from a string
		// print Syntax
		System.out.println(str.substring(0,6));
		System.out.println(str.substring(7));
		
	}

}

package com.class14;

public class StringMiniRecap {
	public static void main(String[] arg)
	{
		String str=new String("Hello");
		//String str3=new String("Hello");
		String str3=str;
		System.out.println((str==str3));
		
		//comparision of object and not valyes so kit will return false
				System.out.println(str);
		String str2=str.replaceAll("Hello","Bye");
		System.out.println(str2);
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);
		// s1 and s2 pointing to same hello it will return true
	}

}

package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="12-22-1990";//12/22/1990
		
		String str="1423253Hel68778lo788779";
		System.out.println(str.replaceAll("[0-9]" , " "));//leave only text
		//0-9 numbers are replaced not the index njumbers we are pointing
		
		System.out.println(str.replaceAll("[a-zA-Z]" , ""));// leave only numbers
		// remove everything except textand numbers
		String str2="Hi#$%How#$%4557678";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
System.out.println(str2.replaceAll("[^a-zA-Z0-9]" ,""));
System.out.println(str1.replace("-", "/"));
System.out.println(str1.replace('-','/'));
	}

}

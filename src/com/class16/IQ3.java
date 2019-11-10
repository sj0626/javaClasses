package com.class16;

public class IQ3 {
	public static void main(String[] arg)
	{
		 ////////////////////How many alpha characters in String
		   String str ="Hello 698887897 welcomegjfhjgu!!!!";
		  str= str.replaceAll("[^a-zA-Z]","");
		  System.out.println(str.length());
		  
		  ////////////////////////////////////////
///  How to part of the string from the string ? What is substring?fingd number of strings in string
	
		  String str1="Today is very cold outside";
		String subString=  str1.substring(0,5);
		System.out.println(subString);
		////////////split based on the space array of string
		//step 2 find the length of an array
		String[] words=str1.split(" ");
		System.out.println(words.length);
		/////// reverse the string
		String given="Welcome to the java class";
		/* to reverse string 
		 * split array of string
		 * use loop rto decrement
		 */
		String []str2=given.split(" " );
		int len = str2.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(str2[i]);
		}
		/////////////////////////second way
		String word2="loved";
		for(int i=word2.length()-1;i>=0;i--)
		{
			System.out.println(word2.charAt(i));
		}//////////////////////
		
		///////reverse the string
		
		
		
	}

}

package com.class14;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString 
		String str="Today is java class";
		System.out.println(str.replaceAll("\\s", ""));

	
	///////////////////////////////////////////
	
	
	String str2="#$5446Hello&**(())";
	System.out.println(str2.replaceAll("[^A-Z-a-z]", " "));

	String str3=str2.replaceAll("[^A-Z-a-z]", "");
	System.out.println(str3.length());
	
/////////////////////////////////////////////////
	/* You have a string a="Is it Saturday? Is it raining? 
	 * Do we have a Java Class Today?"
	 * How would you find out how many sentences are in that string?
	 */
	String a="Is it Saturday?,"
			+"Is it Raining,"
			+" Do we have a java class today,";
	String[] array=a.split(",");
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i].trim());
	}
	System.out.println(array.length);
}
}
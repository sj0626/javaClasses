package com.class15;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java classes ac Syntax are awesome";
		String str1="gjgdfhfjdg %^&&*8i8";
						System.out.println(str.replace("awesome","great"));
		//System.out.println(str.replace("Git","Sdlc"));
		System.out.println(str.replace("a","AA"));
		//replaceALl--> specify regular expression
		//lets remove all special characters
		System.out.println(str.replaceAll("[a-z 0-9]" ,""));
		System.out.println(str1.replaceAll("\\W" ,""));
		String myString="Java classes ac Syntax are awesome";
		String [] array=myString.split("a");
		int len=array.length;
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			System.out.println(array[i]);
		}
	
	}

}

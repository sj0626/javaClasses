package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str2= new String();
		str2="Video provides a powerful way to help you prove your point. "
		+ "When you click Online Video, you can paste in the embed "
		+ "code for the video you want to add. ";
System.out.println(str2.replaceAll("to(.*)", ""));
		//.replace
		String str=" your Syntax Technologies is your place to study";
		System.out.println(str.replace('y','i'));
		System.out.println("*************");
		System.out.println(str.replace("your","My "));
		//.replaceAll
 System.out.println();
 //System.out.println(str2.replaceFirst(" ",""));
 System.out.println(str2.toLowerCase().replace("video", "audio"));
 
 
 System.out.println(str.contentEquals("video"));
	}

}

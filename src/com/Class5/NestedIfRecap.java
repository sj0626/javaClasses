package com.Class5;

public class NestedIfRecap {
	public static void main(String[] args)
	{
	
	boolean isDisplayed=true
			;
	String buttonText="sign in";
	if(isDisplayed){
		System.out.println("button is displayed");
	if(buttonText.equals("sign out"))
			{
		System.out.println("Test case pass");
			}
	else {
		System.out.println("Wrong text is displayed");
	}
	}
	else {
		System.out.println("button is not displayed");
	}
}
}
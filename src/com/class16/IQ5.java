package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="Welcome to the Java class";
		String reversed="";
		String[] str3=given.split("\\s");
		for(int i=str3.length-1;i>=0;i--)
		{
			reversed=reversed+ str3[i]+ " ";
		}
		System.out.println(reversed);
String given1="Today is java class";
////////////////////////////////////////////////////////

String replaced="";
char[] charArray=given1.toCharArray();
for(int i=charArray.length-1;i>=0;i--)
{
	replaced=replaced+charArray[i];
}
System.out.println(replaced);
	}

}

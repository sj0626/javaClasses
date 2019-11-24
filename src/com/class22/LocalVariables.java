package com.class22;

public class LocalVariables {
void sayName()
{
	String myName="John";
	System.out.println(myName);
}
String createEmail(String name,String lastName, String email)
{
	String userEmail=name+lastName+"@"+email+".com";
	return userEmail;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalVariables obj=new LocalVariables();
obj.sayName();
String userEmail=obj.createEmail("John", "Smith", "Outlook");
System.out.println(userEmail);
	}

}

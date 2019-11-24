package com.class24;

public class Book {
String Title;
String Author;
Book()
{
	System.out.println("I'm constructor with no parameters");
}
Book(String Title,String Author)
{
	this.Title=Title;
	this.Author=Author;
}
void Info()
{
	System.out.println(Title +" " +"by " +Author);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book name=new Book();
Book name1=new Book("Harry Potter" ,"J.k.Rowling");
name.Info();
name1.Info();
}
}
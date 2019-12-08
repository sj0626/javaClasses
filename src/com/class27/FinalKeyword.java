package com.class27;

public class FinalKeyword {
public  final String str="Hello";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am awesome";
		str="hello";
		System.out.println(str);
final  String finalString="Hi";
// variables which we want not to change their values we use final

	}
	public final void hello()
	{
		System.out.println("I am  a final method in parent class");
}
	class FinalKeywordChild extends FinalKeyword
	{
		
	
	
	public final void hello()
	{
		System.out.println("I am  a final method in parent class");
	}

		
	

}
}
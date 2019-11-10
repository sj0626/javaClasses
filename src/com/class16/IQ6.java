package com.class16;

public class IQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*MOM ,dad Palindrome
 * 
 */
		
		String original="Kayak";
		String reversed="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reversed=reversed+original.charAt(i);
		}
		System.out.println(reversed);
		if(original.equalsIgnoreCase(reversed))
{
	System.out.println("Palindrome");
}
		else
		{
			System.out.println("not palindrome");
		}
	}

}

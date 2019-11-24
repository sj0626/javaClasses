package com.class20;

public class Task {
	public String student;
	int intnumber;
	String revString(String Word)
	{
		String rev="";
		for(int i=Word.length()-1;i>=0;i--)
		{
		 rev=rev+Word.charAt(i);	
		}
		System.out.println(rev);

		return rev;
	}
	public boolean isPalindrome(String Word)
	{
		boolean result=false;
		String reverse=revString(Word);
				if
				(Word.equals(reverse))
		{
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		return result;
	}
	 boolean bothEven(int num1,int num2)
	  {
	    boolean isEven=false;
	    if((num1%2==0)&&(num2%2==0))
	    {
	     isEven=true; 
	    }else if ((num1%2==0)||(num2%2==0))
	    {
	     
	      isEven=false;
	    }
	   //System.out.println(isEven);
	    return isEven;
	  }
	
	
		String makeCapital(String word)
		{
		  word=word.toUpperCase();
		  System.out.println(word);
		  return word;
		}
		private String m1(String word)
		{
		  return word;
		}
		   String m2(String word)
		{
		  return word;
		}
		protected String m3(String word)
		{
		  return word;
		}
		public String m4(String word)
		{
		  return word;
		}
		
		 
		
		  
		
			  
			 
			  
			  
	 
	  
	
		public static void main(String[] args) {
			
					
Task obj=new Task();
obj.student="John";
int batch=3;

System.out.println(obj.student);
System.out.println(batch);
obj.makeCapital("test");

obj.isPalindrome("toot");
obj.bothEven(13,6);


  
  
}


		}


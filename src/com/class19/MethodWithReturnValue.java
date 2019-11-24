package com.class19;

public class MethodWithReturnValue {
	int findLargest(int num1,int num2)
	{
		int largest;
		if(num1>num2)
		{
			largest=num1;
		}
		else
		{
			largest =num2;
		}
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*declare a string
		 * if string has more then 10 characters 
		 * we are going to say string is large
		 * else 
		 * 
		 */MethodWithReturnValue obj1=new MethodWithReturnValue();
		
		
		int large=obj1.findLargest(95, 67);
		System.out.println(large);
String str="welcome home";
int len=str.length();
if(len>10)
{
	System.out.println("String is large");
}
else
{
	System.out.println("String is small");
}

char character=str.charAt(4);
System.out.println(character);

Recap obj=new Recap();
int num=obj.sum(10, 30);
System.out.println(num);

	}

}

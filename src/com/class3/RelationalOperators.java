package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		// return value for relational operators will always be true or false
		System.out.println("*****************");
double d=1.99;
double d1=2.99;
boolean b=d>d1;
System.out.println(b +" " +"d is not greater then d1");
boolean b1=d<d1;
System.out.println(b1 +" " +"d is not equal to d1");
 boolean b2= d==d1;
 System.out.println(b2);
boolean b3= d!=d1;
System.out.println(b3);


int a=20;
int f=30;
if(a>f)
{
	System.out.println("a is larger number");
	// condition is not met so code will not be executed
}else
{
	System.out.println("f is larger number");
}
int expectedHours=15;
int actualHours=20;

if(actualHours>expectedHours)
{
	System.out.println("you will  succeed");
}
else
{
	System.out.println(" no success");
}
	double teaPrice=4.99;
	double allowedPrice=3.99;
	teaPrice-=2;
	if(allowedPrice>=teaPrice)
	{
		System.out.println("I will buy tea");
	}
		else 
		{
			System.out.println("i cant afford");
		}
	System.out.println("I keep writing some code");
	
			
		
	


}
}
	



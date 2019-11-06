package com.class3;

public class PrimitiveCasting {
	public static void main(String[] args)
	{
		double d=12;
		System.out.println(d);
		//primitive casting
		//int i=12.0; complile time error//casting-changing/converting one type to another
	
	byte b=127;
	int i=b;
	int num=123;
	double d1=num;
	//bigger box is dpouble and int is small box ,widening concept
	System.out.println(d1);
	//narrowing or explicit or manual casting
	double d2=123.56;
	int num2=(int)d2;
	System.out.println(num2);
	int num3=1000;
	byte b1=(byte)num3;
	System.out.println(b1);
	
	
	
	
	
	}

}

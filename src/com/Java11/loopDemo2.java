package com.Java11;

public class loopDemo2 {
public static void main(String[] args)

{
	String[] [] names= {
			{"Fabi","John","Raj","ABCF"},
			{"Rani","Rakesh","Raman","Rita"},
			{"Rose","Tulip","Gold","Silver"}
	};
	int length=names.length;
	System.out.println(length);
	int lengthofcolumns=names[0].length;
	System.out.println(lengthofcolumns);
	for(String getArrays[]:names)
	{
		for(String getElement:getArrays )
		{
			System.out.print(getElement +" ");
		}
		System.out.println();
	}
}
}

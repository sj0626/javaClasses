package com.Java11;
import java.util.Arrays;
public class SortingArray {
	public static void main(String[] arg)
	{
		String[] actualNames= {"John","Smith","Alex","Tanaz"};
		Arrays.sort(actualNames);
		String[] ExpectedNames= {"Smith","John","Alex","Tanaz"};
		Arrays.sort(ExpectedNames);
		
		
		
		int [] numbers= {123,43,15, 66};
		for(int i:numbers)
		{
			System.out.println(i);
		}
		System.out.println("*****");
		Arrays.sort(numbers);
		for(int i:numbers)
		{
			System.out.println(i);
		}
	}

}

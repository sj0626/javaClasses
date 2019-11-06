package com.class14;

public class splitMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// how to seperate comma delimiter string
		String str="If you come to class early,"
				+"then u can study more, alos u can learn more,"
				+"also u can leave early";
		String [] array=str.split(",");
		for (int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("*********************");
		String str1="Welcome to Syntax Technologies";
		//String [] array2=str1.split(" " ,2);
		String [] array2=str1.split(" " ,3);
		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}
		
	}

}

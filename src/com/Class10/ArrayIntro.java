package com.Class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		a=10;
		int [] b;
		int c[];// declare an array--. preffered way
		b=new int [4];//initialization an array
		int[] array=new int[4];// declaration and initialization all in one line
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//access value from an array
		System.out.println(array[2]);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		String[] classes= new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		System.out.println("today I have" +" " +classes[0] +" " +"classes");
		// the size of an array is fixed
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0] + nums[2]);
        String[] names= new String[3];
        names[0]="John";
        names[1]="Mary";
       System.out.println(names[2]);
       // it will give only error during run time arrayIndexOutOf boundException:
       int [] numbers=new int[4];
       numbers[1]=100;
       numbers[3]=200;
       System.out.println(numbers[0]);
       double [] numbers1=new double[4];
       numbers[1]=100;
       numbers[3]=200;
       System.out.println(numbers1[0]);
}
}

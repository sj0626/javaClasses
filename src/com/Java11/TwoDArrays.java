package com.Java11;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] [] array=new int [3][4];
array[0][0]=8;
array[0][1]=89;
array[0][2]=87;
array[0][3]=1;

// create  2d array of strings 2 rows 3 columns and print value 
//in second row and 3rd column

String[] [] name= new String[2][3];
name[0][0]="Shubha";
name[0][1]="Gunay";
name[0][2]="Fabi";

name[1][0]="Vibha";
name[1][1]="Rahul";
name[1][2]="John";
System.out.println(name[1][2]);
for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
		System.out.println(name[i][j]);
}System.out.println();

int [] [] number1= {
		{8,7,5,9,1},
		{1,5,4,9,23,8},
		{3,45,56,45,34}
};
//identify the numbers of rows
System.out.println(number1.length+"the number of arrays or rows");
// identify the number of columns or number odf elements
System.out.println(number1[1].length+"the number of columns or number of elements");// 2 d array is array inside array
for(int i=0;i<number1.length;i++)
{
	for(int j=0;j<number1[i].length;j++)
	{
		System.out.print(number1[i][j] +" " );
	}
	System.out.println();
}
	
	
	}
	
	}



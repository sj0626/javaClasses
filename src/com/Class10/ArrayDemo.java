package com.Class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= new int[21474789];
		int [] nums1=new int[5];
		nums1[0]=12;
		nums1[1]=13;
		nums[2]=14;
		nums[3]=15;
		// to find number of elements insisde an array  we use .length its property of an array 
		System.out.println(nums1.length);
		String [] array= {"Winter" , "summer", "Fall", "Spring"};
		// I was born in summer
		System.out.println("I was born in " +" " +array[1]);
		System.out.println(array.length);
		int arraySize=array.length;
		// array.length will return an integer
		// Create an array of chars and store grades into it:A,B,C,D,E,F. Then print a grade
		//B (use 2 different ways of creating an array
		char [] array1={'A' ,'B','C','D','E','F'};
		System.out.println(array1[1]);
		//Create an array of names and store all names of your group. Then print your nmae from
		// that array. (use 2 different ways of creating an array
		String[] names= new String[7];
		names[0]="Fabi";
		names[1]="Shubha";
		names[2]="Gunay";
		names[3]="Emily";
		names[4]="Seda";
		names[5]="shugofa";
		names[6]="Eric";
		
		System.out.println(names[1]);
		// Create an array of words :Java, Saturday,day,coding, is.Print the followiung sentence using element of ayyar
		//:"Saturday is java coding day";
		String [] sent= {"Java","Saturday","day","coding","is"};
		System.out.print(sent[1] +" " );
		System.out.print(sent[4]  +" ");
		System.out.print(sent[0]  +" ");
		System.out.print(sent[3]  +" ");
		System.out.print(sent[2]  +" ");
		char[] grades= {'A','B','C','D' ,'F','E'};
		int a=2;
		System.out.println(grades[2]);
		System.out.println(grades[a]);
		a+=2;
		System.out.println(grades[a]);
		a--;
		System.out.println(grades[a]);
		for(int i=0;i<grades.length;i++)
		{
			System.out.println(grades[i]);
		}
String[] animals= {"Cat" ,"Dog", "cow","snake","elephant"};
int size=animals.length;
for(int i=0;i<size;i++)
{
	System.out.println(animals[i]);
}
// creats an array to store 5 values print all of them in one line
double [] num= {1.1,1.2,1.3,1.4,1.5};
for(int i=0;i<num.length;i++)
{
	System.out.print(num[i] );
	
}
//


	}

}

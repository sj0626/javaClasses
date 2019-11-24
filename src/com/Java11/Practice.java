package com.Java11;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		int[] [] num= {{34,46,67,89},
				       {6,9,5,67}};
		//int max=num[0][0];
		int l = num[0].length;
		
		for(int j=0; j<l; j++)
		{
			for(int i =0; i<num.length; i++)
			{
				sum += num[i][j];
			}
			System.out.println(sum);
			sum=0;
		}
		
		
/*		
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<num[i].length;j++)
			{
				////if(max<num[i][j])
				////{
				//	///max=num[i][j];
				////}////
				sum=sum+num[i][j	];
				
				
			}
			System.out.println(sum);
			sum=0;
			}
			////System.out.println(max)	;
			
	*/	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			}
		System.out.println("-----------------");
	for (int i=1;i<=4;i++)
	{ 
	for(int j=4;j>=i;j--)
	{
		System.out.print(" ");
	}
		
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=4;k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("----------------");
	
	
	for(int i=0;i<=3;i++)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=3;k>=i;k--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
		
		

}

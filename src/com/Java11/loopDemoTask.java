package com.Java11;

public class loopDemoTask {
	public static void main(String[] arg)
	{
		int[] [] num= {
				{4,5,6,7},
				{1,2,3,9},
				{34,45,56,67}
		};
		for(int [] num1:num)
		{
			for(int j:num1)
			{
				System.out.print(j +" ");
			}System.out.println();
		}
		// Print sum of all elemnets
		int sum=0;
		for(int [] num2:num)
		{
			for(int k:num2)
			{
			sum=sum+k;
			
			}System.out.println(sum);
		}
		
		//Print even numbers
		for(int [] even:
			num)
		{
			for(int i:even)
				if(i%2==0)
				{
					System.out.println("Even numbers");
					System.out.println(i);
				}
				else {
					System.out.println("Odd numbers");
					System.out.println(i);
				}
		}
		
		
	}

}

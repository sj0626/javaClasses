package com.class15;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections; 


public class InterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
		
		int y=20;
		x=x+y;//30
		y=x-y;//20
		x=x-y;//30-20=10
		System.out.println(x);//10
		System.out.println(y);//20
		String str1="Hello";
		String str2="Bye";
		str1=str1+str2;//HelloBye
		str2=str1.substring(0,5);
		System.out.println("The value lof str2" +" "   +str2);
		str1=str1.substring(5);
		System.out.println("The value of str1" +" " +str1);
		//////////////////////////////////////////////
		/*to find max and min
		 * find second largest
		 		 */
		int [] array= {100,-90,8787,898,0,1};
		//easiest way
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		System.out.println(min);
		System.out.println(max);
		////////////////////////2nd way
		int [] Myarray= {100,-90,8787,898,0,1};
		int largest=Myarray[0];
		int smallest=Myarray[0];
		for(int i=0;i<Myarray.length;i++)
		{
			if(Myarray[i]>largest)
			{
				largest=Myarray[i];
			}
			if(Myarray[i]<smallest)
			{
				smallest=Myarray[i];
			}
		}
		System.out.println("The smallest value in the array is   " +smallest);
		System.out.println("The largest value is " +largest);
		////////////////////////////////second largest number
		int [] nums= {100,-90,8787,898,0,1};
		int large=nums[0];
		int seclarge=nums[0];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>large) {
				seclarge=large;
				large=nums[i];
			}
			if(nums[i]>seclarge&&nums[i]<large)
		 {
			 seclarge=nums[i];
			 
			
				
				}
			
			}
		System.out.println("The second largest value in the array is   " +seclarge);
		System.out.println("The largest value is " +large);
		/////////////////////////////////////////////
		
		int num2=20;
		int num3=10;
		
		num2=num2+num3;//30
		num3=num2-num3;//20
		System.out.println(num3);
		num2=num2-num3;
		System.out.println(num2);
		/////////////////////////////substring 
		String shabd="Hello";
		String shabd2="Bye";
		shabd=shabd+shabd2;
	    shabd2=shabd.substring(5);
	    System.out.println(shabd2);
	    shabd =shabd.substring(0,5);
	    System.out.println(shabd);
	    
	    int[] numbers= {566,789,53446,6787,56,7};
	   Arrays.sort(numbers);
	   int max1=numbers[5];
	   System.out.println(max1);
	   int min1=numbers[0];
	   System.out.println(min1);
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

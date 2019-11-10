package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PRINT -100 PRIME NUMBERS ONLY
		int number=5;
		boolean isPrime=true;
		if(number==0 || number==1)
		{
			isPrime=false;
		}
		else {
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				isPrime=false;
				break;
			}
			}
		}
			if(isPrime)
			{
				System.out.println(number +"is a prime number");
			}
			else
			{
				System.out.println(number +"is not a prime number");
			}
		
	}

}

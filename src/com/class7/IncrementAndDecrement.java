package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;//declaring and initializing/
		a=a+1;// shorthand assignment
		a++;//increment operators
		
		System.out.println(a);
		int b=10;
		b-=1;
		b--;//decrement operator
		System.out.println(b);
// with incremment and decrement operators can be used only with variables
		
		int time=12;
		
		while(time>=6)// condition is true code executes once
		{
			System.out.println("Good Morning");// code executes infinite times called as infinite loop
		time--;//adding 1 8+1+
		}
		int i=0;
		while(i<=20)
		{
			i++;
			
			System.out.println(i);
			
		}
		int y=10;
		while(y<=30)
		{
			System.out.println(y);
			y++;
		}
		int x=50;
		while(y>=20)
		{
			System.out.println(y);
			y--;
		}
		System.out.println("-----------");
		//print out odd numbers from 50-100
		int c=101;
		while(c>=50)
		{
			System.out.println(c);
			c-=2;
		}
		
		System.out.println("----------");
		int d=100;
		while(d>=0) {
			System.out.println(d);
		d-=2;
		}
		System.out.println("---------");
		//print out even numbers from 100-1
		int q=100;
		while(q>=1) {
			if(q%2==0)
			{
				System.out.println(q);
			}
			q--;
		}
		
		System.out.println(q);
	}

}

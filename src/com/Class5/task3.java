package com.Class5;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How much do you make");
		int salary=scan.nextInt();
		String car1="a";
		String car2="b";
		String car3="c";
		String car4="d";
		if(salary>50000) {
			System.out.println("You may buy a brand new car");
			if(salary>=70000) {
				car1="Audi";
				System.out.println(car1);
			}
			else if(salary>=80000)
			{
				car2="Mercedes Benz";
				System.out.println(car2);
			}
			else if(salary>=90000)
			{
				car3="Jaguar";
				System.out.println(car3);
			}
			else if(salary>=100000)
			{
				car4="Tesla";
				System.out.println(car4);
			}else if(salary>=60000&&salary<=50000) {
				System.out.println("Save up money");
			}
			
		}
		else
		{
			System.out.println("You should buy a used car");
		}
		
		
	}

}

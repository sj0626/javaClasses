package com.class7;

public class WorkDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*boolean WorkDay=true;
		int day=1;
		while(WorkDay)
		{
			System.out.println("I need a day off");
			
		
			if(day==6) {
                System.out.println("I do not need a day off more");
               break;//or WorkDay=false;
               
		}
			day++;

	}*/

		int num=7;
		while(num<=100)
		{
			if(num%7==0)
			{
				System.out.println(num);
			}
			else
			{
				System.out.println("num is not didvisible by 7");
			}
			num++;
		}
}
}
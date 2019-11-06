package com.Class5;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ask user to enter boolean value for sale
		 * if sale check the price of gthe item
		 * based on the amount we will have to calculate the price after discount
		 * if price<20 apply 10%
		 * if price between 20-100 -20%
		 * if between 100-150-30%
		 * anything else-50%
		 * after discount --- the price of item reduce from - to -
		 * 
		 */
Scanner scan=new Scanner(System.in);
System.out.println("enter sale");

boolean sale=scan.nextBoolean();
double price=0;
double discount=0;
double price1=0;
if (!sale)
{
	System.out.println("I am not shopping");
}
else {
	System.out.println("enter the price");
	 price=scan.nextInt();
	 if(price<20)
{
	discount=price*0.1;
	price1=price-discount;
	System.out.println(price);
	
}
else if(price>=20&&price<=100)
{
	discount=price*0.2;
	price1=price-discount;
	System.out.println(price1);
	
}
else if(price>100&&price<=500)
{
	discount=price*0.3;
	price1=price-discount;
	System.out.println(price1);
	
}else if(price>500)
{
	
discount=price*0.1;
price1=price-discount;
System.out.println(price1);

}

}
System.out.println("After discount" +" "+discount +" " +" the price of the item reduce from "+" " +price +" "+"to"+" " +price1);
}
}
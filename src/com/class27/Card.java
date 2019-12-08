package com.class27;
/*define a class card with 2 methods and this class should have 4 
 * subclasses in which some behavior can be overridden and some can implement
 * its own behavior
 * 
 */
public class Card {
	public void chargeInterest()
	{
	System.out.println("card charges 25% interest");	
	}
	
public void creditLimit()
{
	System.out.println("Credit limit of the card is 5000");
}
}

class AX extends Card
{
	public void creditLimit()
	{
		System.out.println("Credit limit of AX card is 25000");
	}
}

class MC extends Card
{
	public void creditLimit()
	{
		System.out.println("Credit limit of the  MC card is 15000");
	}
	public void cashBack()
	{
		System.out.println("MC gives cash back of 3%");
	}
}

class visa extends Card
{
	public void creditLimit()
	{
		System.out.println("Credit limit of the  visa card is 20000");
	}
	
	
}

class Discovery extends Card{
	public void applePay()
	{
		System.out.println("Discovery can take apple pay");
	}
}
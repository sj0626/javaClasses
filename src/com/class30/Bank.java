package com.class30;

public interface Bank {
	void haveChecking();
	void haveSavings();
	

}
interface trustable
{
	void trust();
	
}
class Finance
{
	public void financing()
	{
		System.out.println("Financial transactions");
	}
}

class BOA  extends Finance implements Bank,trustable//multiple inheritance
{

	@Override
	public void haveChecking() {
		// TODO Auto-generated method stub
	System.out.println("Bank of America has checking account");	
	}

	@Override
	public void haveSavings() {
		// TODO Auto-generated method stub
	System.out.println("Bank of America has saving account");	
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		System.out.println("you can trust BOA");	
	}
	
}

class CapitalOne extends Finance implements Bank,trustable
{

	@Override
	public void haveChecking() {
		// TODO Auto-generated method stub
		System.out.println("CapitalOne has checking account");
	}

	@Override
	public void haveSavings() {
		// TODO Auto-generated method stub
		System.out.println("CapitalOne has saving account");	
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		System.out.println("You can trust CapitalONe");	
	}
	
}
class CapitalOneChild extends CapitalOne
{
	
}

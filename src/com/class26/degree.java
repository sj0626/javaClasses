package com.class26;

public class degree {
 public void getdegree()
{
	System.out.println("I got degree");
}
}

class underGraduate extends degree
{
	public void getdegree()
	{
		System.out.println("I'm an undergraduate");
	}
}

	class Postgraduate extends degree
	{
		public void getdegree()
		{
			System.out.println("I'm postgraduate");
		}
	}


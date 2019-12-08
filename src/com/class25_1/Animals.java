package com.class25_1;

public class Animals {
	
	private int walk(int feet)
	{
		System.out.println("I can walk " +"this" +feet);
		return feet;
	}
	
	private void walk()
	{
		System.out.println("I can run");
	}

	private String walk(String path)
	{
		System.out.println("I can walk and run");
		return path;
	}
	public static void main(String[] args) {
		Animals obj=new Animals();
		obj.walk();
		obj.walk(24);
		obj.walk("Woodcrest");
			
				
	}
}

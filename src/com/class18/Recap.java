package com.class18;

public class Recap {
	int students,teachers,classRooms;
	String name,address,website;
	void study()
	{
		System.out.println("Students studying" +" " +name);
	}
	void teach()
	{
		System.out.println("teachers teaching at"  +" " +name);
	}
	public static void main(String [] args)
	{
		Recap school=new Recap();
		school.name="Syntax";
		school.students=200;
		Recap school1=new Recap();
		school1.name="Pinnacle";
		school1.students=150;
		school1.teach();
		school.teach();
		school.study();
	}

}

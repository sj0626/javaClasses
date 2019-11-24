package com.class25;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("create an object of Employee class");
Employees emp=new Employees();
emp.Salary=70000;
System.out.println(Employees.CompanyName);
emp.getPaid();
emp.getPaid();
System.out.println("create an object of ScrumTeam class");
scrumTeam sm=new scrumTeam();
sm.Salary=90000;
sm.Work();
sm.getPaid();
sm.artiFacts="Product Backlog,Sprint Backlog,BurnDownChart";
sm.Ceremonies="Sprint Demo,Planning,Retro,Daily Standup";
Developer dev=new Developer();
dev.Salary=100000;
dev.artiFacts="Product Backlog,Sprint Backlog,BurnDownChart";;
dev.Work();
dev.getPaid();
dev.code();
dev.attendScrumeetings();

	}

}

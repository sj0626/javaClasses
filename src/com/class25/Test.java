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
System.out.println(scrumTeam.artiFacts);
System.out.println(scrumTeam.Ceremonies);
System.out.println("create an object of DEveloper");
Developer dev=new Developer();
dev.Salary=100000;
System.out.println(scrumTeam.artiFacts);
dev.Work();
dev.getPaid();
dev.code();
dev.attendScrumeetings();
System.out.println("create object for tester class");
Tester t=new Tester();
t.test();

t.attendScrumeetings();
System.out.println(scrumTeam.Ceremonies);
System.out.println(scrumTeam.artiFacts);
t.Salary=85000;
t.getPaid();
t.attendScrumeetings();
t.Work();
System.out.println("create object of ProductOwner");
ProductOwner PO =new ProductOwner();
PO.prioritize();
PO.attendScrumeetings();
PO.Salary=120000;
PO.getPaid();
PO.Work();
System.out.println(scrumTeam.artiFacts);
System.out.println(scrumTeam.Ceremonies);
sm.employeeId=106465;
dev.employeeSSN;//not accessible because its private


	}

}

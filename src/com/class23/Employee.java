package com.class23;

public class Employee {
	
	  String name;
	  String lastName;
	  int employeeId;
	 String startDate;
	 int salary;
	 
	 Employee()
	 {
	   
	 }
	 Employee(String empName,String empLastName,int iD,String Date,int sal)
	 {
	   name=empName;
	   lastName=empLastName;
	   employeeId=iD;
	   startDate=Date;
	   salary=sal;
	 }
	 void display()
	 {
	   System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	 }
	}


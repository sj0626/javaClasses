package com.class23;

public class SyntaxTechnologies {
	
	  String schoolName;
	  int batch;
	  String year;
	  String lastDayOfClass;
	  
	  SyntaxTechnologies()
	  {
	    
	  }
	   SyntaxTechnologies(String Name,int batchNumber,String classYear,String lastDay)
	  {
	    schoolName=Name;
	    batch=batchNumber;
	  year= classYear;
	  lastDayOfClass=lastDay;
	  }
	  void display()
	  {
	    System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	  }
	}


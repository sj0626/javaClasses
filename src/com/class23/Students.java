package com.class23;

public class Students {

	String StuName;
	int Math;
	int English;
	int science;
	static char grade;
	
	Students(String Name,int sub1,int sub2,int sub3)
	{
		StuName=Name;
		Math=sub1;
		English=sub2;
		science=sub3;
		
		
	}
	
	public void Avg()
	{
		int total=Math+English+science;
		System.out.println(total=total/3);
		if(total>90)
		{
			grade='A';
			System.out.println (StuName +" "+"grade is" +grade);
		}
		else if(total<90 && total>80)
		{
			grade='B';
			System.out.println("grade is" +grade);
		}
	}

public static void main(String[] args)
{
	Students stu1= new Students("Gunay",95,82,96);
	Students stu2=new Students("Shilpa",83,89,67);
	Students stu3=new Students("Pinky",95,98,99);
	stu1.Avg();
	stu2.Avg();
	stu3.Avg();
	
}
}
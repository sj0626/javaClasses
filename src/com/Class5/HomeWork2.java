package com.Class5;

import java.util.Scanner;

public class HomeWork2 {
	
	public static void main(String[] args)
	{
/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		int QuizScore=scan.nextInt();
		System.out.println("Enter your midterm score");
		int MidtermScore=scan.nextInt();
		System.out.println("Enter your final score");
		int FinalScore=scan.nextInt();
		String grade;
		int average=(QuizScore+MidtermScore+FinalScore)/3;
		if(average>=90)
		{
			 grade="A";
		}else if(average<90 && average>=70)
		{
		 grade="B";

		}else if(average>=50&&average<70)
		{
		grade="c";
		}
		else if(average<50)
		{
				grade="F";

		}else {
			System.out.println(grade="valid");
		}
		System.out.println("Your average is" +" " +average +" " +"and your grade is" +" " +grade);
	}

}

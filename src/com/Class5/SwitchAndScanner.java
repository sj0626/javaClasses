package com.Class5;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ask user to enter their gender f or M
		 * based on input provide
		 * if m =male
		 * f=female
		 */
		String userGender;

	Scanner scan=new Scanner(System.in);
	System.out.println("please enter your gender :F or M");
			char gender=scan.next().charAt(0); 
			switch(gender) {
			case 'f':
			userGender="female";
			break;
			case  'm':
				userGender="male";
				break;
				default:
					userGender="unknown";
			}
			System.out.println("Your gender is" +" " +userGender);
			}
	
	
	}



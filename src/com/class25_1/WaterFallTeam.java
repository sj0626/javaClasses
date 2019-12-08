package com.class25_1;

import com.class25.Employees;

public class WaterFallTeam extends Employees {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	WaterFallTeam team=new WaterFallTeam();
	System.out.println(Employees.CompanyName);
	//accessing protected variable in different package
	team.employeeId=102;
	System.out.println(team.employeeId);
		}


	}



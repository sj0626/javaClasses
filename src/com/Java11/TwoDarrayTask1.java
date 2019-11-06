package com.Java11;

public class TwoDarrayTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] []Name= {
				{"Mr","Mrs","Ms.","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
				
		};
		for(String [] suffix:Name)
		{
			for(String i:suffix)
			{
				if(i.equals("Mrs"))
				{
					System.out.print(Name[0][1] +" ");
					System.out.println(Name[1][0]);
				}
				
				else if(i.equals("Mr"))
				{
					System.out.print(Name[0][0] +" ");
					System.out.println(Name[1][3] +" ");
				}
				else if(i.equals("Ms."))
				{
					System.out.print(Name[0][2] +" ");
					System.out.println(Name[1][2] +" ");
				}
				else 
				{
					
						System.out.print(Name[0][3] +" ");
						System.out.println(Name[1][1] +" ");
						break;
					}
				}
			}
		}

	}



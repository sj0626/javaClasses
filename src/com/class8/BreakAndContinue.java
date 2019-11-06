package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=10;i++)
{
	if(i==2)
	{
		break;//break exits the loop
	}
	System.out.println(i);
}
System.out.println("i am outside loop");


System.out.println("******************");
//continue--.it will skip current iteration
for(int i=1;i<=20;i++)
{
	if(i==5||i==6||i==7)
	{
		continue;
	}
	System.out.println(i);
}
System.out.println("*88888888");
int i=1;
while(i<10)
{
   
   if(i==5||i==7||i==8||i==9)
   {
         
         continue;
      
   }
   
   
 System.out.println(i); 
 
 i++;
}
 
	}

}

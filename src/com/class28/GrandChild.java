package com.class28;
class GrandChild extends GrandParent
{
	
	
  GrandChild()
	  {
	  super();
	    System.out.println("Child Constructor without argument");
	  }
	 GrandChild(int number)
	  {
		 
		 super(number);
		 
	   
	  }
	
  
 public static void main(String[] args) {
	 GrandChild child=new GrandChild();
	GrandChild child1=new GrandChild(10);
	//child.m2();
}
}

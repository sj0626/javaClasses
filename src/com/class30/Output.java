package com.class30;

public interface Output {
	
	

	
	   void display(double  result);
	  
	
}

 interface Functions extends Output
{
	 void  adding(double firstNumber,double SecondNumber);
	 
	 void  substracting(double firstNumber,double SecondNumber);
	 
	 void  multiply(double firstNumber,double SecondNumber);
	 
	 void  dividing(double firstNumber,double SecondNumber);
	 	
}
 
 class Main implements Functions {
	  double result;
	public  void display(double result)
	  {
	    this.result=result;
	    System.out.println("Result is ::: " +result);
	  }
	public void adding(double firstNumber,double SecondNumber)
	 {
	   double add =firstNumber+SecondNumber;
	   //this.result=result;
	   display(add);
	   
	 }
	public  void  substracting(double firstNumber,double SecondNumber)
	 {
	   
	    double sub=firstNumber-SecondNumber;
	   display(sub);
	  
	 }
	public void  multiply(double firstNumber,double SecondNumber)
	 {
	   double mul=firstNumber*SecondNumber;
	   display(mul);
	   
	   
	 }
	public void dividing(double firstNumber,double SecondNumber)
	 {
	   double div=firstNumber/SecondNumber;
	   //this.result=result;
	   display(div);
	  
	 }
	 public static void main(String[] args)
	 {
	   double firstNumber=100.00;
	   double SecondNumber=20.00;
	   Main main=new Main();
	   main.adding(firstNumber,SecondNumber);
	   main.substracting(firstNumber,SecondNumber);
	   main.multiply(firstNumber,SecondNumber);
	   main.dividing(firstNumber,SecondNumber);
	/*Create a WebDriver Interface that will have the 
	 * following unimplemented behaviour: openBrowser(), 
	 * closeBrowser(), maximizeWindow(), findElement(). 
	 * Create 2 classes that implements WebDriver interface: 
	 * ChromeDriver and FirefoxDriver.
	 */
   
	 }
	  

	}

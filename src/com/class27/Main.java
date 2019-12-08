package com.class27;
import java.util.Scanner;

public class Main {
	
	  public  final String reverseString(String myWord)
	  {
	    
	    String replaced="";
	    char[] charArray=myWord.toCharArray();
	    for(int i=charArray.length-1;i>=0;i--)
	    {
	    	replaced=replaced+charArray[i];
	    }
	    System.out.println(replaced);
	    return replaced;

	  }
	  
	  public static void main(String[] args) {
		  Scanner scan =new Scanner(System.in);
	  String    myWord=scan.nextLine();
		Main main =new Main();
		main.reverseString(myWord);
	}

}
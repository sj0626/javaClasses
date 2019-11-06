package com.class14;

public class splitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		/*.split()
		 * This method splitss this string  around matches of the given regular expression
		 *split the following strin into array of strings /work
		 * it creates one dimensional array 
		 * */
		
		 
		 str="Video provides a powerful way to help you prove your point. ";
System.out.println(str.split(""));
String [] array=str.split(" ");
for(int i=0;i<array.length;i++)
{
	System.out.println(array[i]);
}
// how can we find how many sentences are in the following string;
String str1="Today is Sunday. Its Sunny day.    and we are having java classes.    ";
//String[] array2=str1.split(".");// dot is not cosidered as regular expression
String[] array2=str1.split("\\.");
System.out.println(array2.length);
for (String string: array2)
{
	System.out.println(string.trim());
}
	}

}

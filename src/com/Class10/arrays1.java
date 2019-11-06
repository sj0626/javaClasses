package com.Class10;

public class arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int colors[][]= {{0,2,6,4},{11,16,27,48}};
    
  for(int row=0;row<colors.length;row++)
  {
	  for (int col=0;col<colors[row].length;col++)
		  System.out.println(colors[row][col]);
  }

}
}
package com.Class5;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*If there is no rain → classMode=“In Class”, 
 * otherwise classMode → “Online”.
 */
boolean IsRain=false;
if(!IsRain)
{
	System.out.println("In Class");
	
}else {
	System.out.println("Online");
}
/* declare the time (1-24)
 * based on the time identify whether it is morning, afternoon or night)
 * if 1-11 morning
 * if 12-15 noon
 * if 16-20 evening
 * if >20 night
 */
 int time =15;
 String timeOfDay;
 if(time>=1&&time<=11) {
	 timeOfDay="Morning";
 }
 else if (time>=12&&time<=15)
 {
	 timeOfDay="noon";
 }else if (time>=16&&time<=20)
 {
	 timeOfDay="evening";
 }
 else if (time>20&&time<=24)
 {
	 timeOfDay="night";
 }
 
 else {
	 timeOfDay="invalid";
 }
 System.out.println("Time of the day is"+" " +timeOfDay);
 if(timeOfDay.equals("Morning"))
 {
	 System.out.println("Good Morning");
 }
	}

}

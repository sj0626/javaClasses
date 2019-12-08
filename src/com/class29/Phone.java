package com.class29;

public abstract class Phone {
	public void makeCall()
	{
		System.out.println("make call");
	}
	public void sendText() {
		System.out.println("Send text");//implemented methods
	}
public abstract void takePictures();
public  abstract void playGames();//un implemented methods

	

}
//concrete class
class iPhone extends Phone
{
	@Override
	public  void takePictures() {
		System.out.println("iphone takes picture");
	}
	@ Override
	public   void playGames()
	{
		System.out.println(" play games on iphone");
	}
	
}

class Samsung extends Phone
{
	@Override
	public  void takePictures() {
		System.out.println("Samsung takes picture");
	}
	@ Override
	public   void playGames()
	{
		System.out.println(" play games on Samsung");
	}
}
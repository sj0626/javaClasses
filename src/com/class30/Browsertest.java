package com.class30;

public class Browsertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome=new ChromeDriver();
		chrome.closeBrowser();
		chrome.openBrowser();
		chrome.maximizeWindow();
		chrome.findElement();
		WebDriver fire=new  FirfoxDriver();
		fire.closeBrowser();
		fire.findElement();
		fire.maximizeWindow();
		fire.openBrowser();
		System.out.println("-----------------");
		WebDriver b1=new FirfoxDriver();
		WebDriver b2=new ChromeDriver();
		WebDriver [] driver=  {b1,b2};
		for( WebDriver driverarray:driver)
		{
			driverarray.openBrowser();
			driverarray.closeBrowser();
			driverarray.findElement();
			driverarray.maximizeWindow();
		}
	}

}

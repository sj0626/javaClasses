package com.class30;

public class ChromeDriver extends Browser implements WebDriver
{
	public void openBrowser() {
		System.out.println("opens Chrome Browser");
	}
	public void closeBrowser() {
	System.out.println("closes Chrome browser");	
	}
	public void maximizeWindow()
	{
		System.out.println("maximizes Chrome browser");	
	}
	public void findElement() {
		System.out.println("helps find elements of Chrome");	
	}
	
	public void takesScreen()
	{
		System.out.println("screenShot takn on chrome driver");
	}
	@Override
	public void refresh() {
		System.out.println("Chrome refreshes");
	}
	}
	
	class FirfoxDriver extends Browser implements WebDriver
	{
		
		public void openBrowser() {
			System.out.println("opens Firefox Browser");
		}
		public void closeBrowser() {
		System.out.println("closes firefox browser");	
		}
		public void maximizeWindow()
		{
			System.out.println("maximizes firefox browser");	
		}
		public void findElement() {
			System.out.println("helps find elements of firefox");	
		}
		public void takesScreen()
		{
			System.out.println("screenShot takn on firefox driver");
		}
		@Override
		public void refresh() {
			// TODO Auto-generated method stub
			System.out.println("firefox refreshes");
		}
	
	}
	


package com.class26;

public class WebDriver {

	public void open()
	{
		System.out.println("Opening browser");
	}
	public void refresh()
	{
		System.out.println("refreshing");
	}
}

class ChromeDriver extends WebDriver

{
	public void open()
	{
		System.out.println("Opening  Chrome browser");
	}
}
class Firefox extends WebDriver
{
	public void open()
	{
		System.out.println("Opening firefox browser");
	}
}
package com.class30;
interface  TakesScreenshot 
{
	void takesScreen();
}
public interface WebDriver extends TakesScreenshot {
/*Create a WebDriver Interface that will have the 
 * following unimplemented behaviour: 
 * openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
 * Create 2 classes that implements WebDriver interface: 
 * ChromeDriver and FirefoxDriver.
 */
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();

}
abstract class Browser {
	public abstract void refresh();

}
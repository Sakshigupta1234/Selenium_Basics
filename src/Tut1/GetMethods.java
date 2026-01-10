package Tut1;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		//Get Methods- We can access these methods through driver instance
		//Get() - Open the URL on the browser
		driver.get("https://www.google.com");
		
		//getTitle()- returns title of the page
		System.out.println(driver.getTitle());

		//getCurrentUrl() - returns Url of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns page source of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns Id of single browser window
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles() - returns id's of multiple browser window
		Set<String> WindowIds= driver.getWindowHandles();
		System.out.println(WindowIds);
		
		
		//close() - close one window at a time
		//quit() - close multiple windows in one shot
		driver.quit();
	}

}

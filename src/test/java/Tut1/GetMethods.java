package Tut1;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		//Get()- Open the Url on the browser
		driver.get("https://www.google.com");

		//getTitle()- returns title of the page
		System.out.println(driver.getTitle());  //Google
		
		//getCurrentUrl()- returns url of the page
		System.out.println(driver.getCurrentUrl()); //https://www.google.com/
		
		//getPageSource() - returns page source of the page
		//System.out.println(driver.getPageSource());
		
		
		//getWindowHandle()- returns Id of Single browser window return type is String
		System.out.println(driver.getWindowHandle());  //847B7237DB9975E32B55A126AABD4F7A
		
		//getWindowHandles() - returns ID's of multiple browser windows
		Set<String> windowIds= driver.getWindowHandles();
		System.out.println(windowIds);  // [C810079B4F23FB59F74465B30DA6A23F]
		
		//close() - close one browser window at a time
		//quit() - close all browser window in one shot
		driver.close();

		
//		Interview Question1 - Suppose you have multiple browser window and you have to close 1t & 3rd window, what you will do?
//				you will pick ID of that windows & based on browser window you can get the the title
	}

}

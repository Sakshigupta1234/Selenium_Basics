package Tut2;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {

/*	Navigational Commands- 
 * navigate().to(url)
 * navigate().back()
 * navigate().forward()
 * navigate().refresh()
 * 
 * Different(Parameter wise it is different)
 * -->driver.get() - access URL in string format only
 * -->driver.navigate().to() - accepts URL in the string format & URL object format 
 */
		
		WebDriver driver=new ChromeDriver();
		URL url=new URL("https://google.com"); //URL is a javaclass
		driver.navigate().to(url);
		
		driver.navigate().to("https://google.com");
		driver. navigate().to("https://demo.nopcommerce.com/register");
		driver.navigate().forward();
		//driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.quit();
	}

}

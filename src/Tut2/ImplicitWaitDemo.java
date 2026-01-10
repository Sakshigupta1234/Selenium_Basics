package Tut2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args)
	{
/* There are two types of wait
 * 1) Implicit wait
 * 2)Explicit Wait 
 * 
 * 
 * Implicit Wait
 * 
 * Syntax - driver.manage().timeouts().implicitWait(Duration.ofSeconds(5));
 * 
 * Advantage -
 * 1)Single time/One statement
 * 2)It will not wait till maximum time if the element is visible
 * 3)Applicable for all the elements
 * 4)Easy to use
 * 
 * Disadvantage-
 * 1)If the time is not sufficient then you will get exception
 */
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit Wait
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	

}

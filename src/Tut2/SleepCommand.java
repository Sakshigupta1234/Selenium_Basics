package Tut2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000); //Java command
		
		driver.findElement(By.xpath("//input[@placeholder=\"Username1\"]")).sendKeys("Admin");
		
		/* Thread.sleep() - easy to use (Pros)
		 * This is not webdriver command this is java command
		 * 
		 * Cons- 1)multiple times use
		 * 		 2) if time is not sufficient then you will get exception
		 * 		 3) It will wait for maximum time out, performance will get slow
		 NoSuchElementException- due to synchronization/element is not present on the page
		 ElementNotFoundException- Locator is invalid
		 */
//
	driver.quit();
	
	}

}

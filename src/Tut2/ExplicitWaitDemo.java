package Tut2;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWaitDemo {

	public static void main(String[] args)
	{
	/*Explicit Wait-
	 * 1) Declaration
	 * 2)Use
	 * 
	 * Conditions based it will work effectively
	 * it will wait for condition to be true , then consider the time
	 * 
	 * 
	 */
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5)); //declaration
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement txtUsername=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]"))); //conditions
		txtUsername.sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@placeholder=\"Username1\"]")).sendKeys("Admin");
		WebElement txtPassword=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Password\"]")));
		txtPassword.sendKeys("Admin");
		WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));
		submit.click();
	}

}

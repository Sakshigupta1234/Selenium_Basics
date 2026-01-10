package Tut1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //This will opens new browser window
		//driver.close();  //it will close 1st browser window
		
		driver.quit();
	}

}

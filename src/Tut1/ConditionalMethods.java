package Tut1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalMethods {

	public static void main(String[] args) {
		
		//Conditional commands-- Access these commands through web element
		//returns boolean value - false/true
		
		//isDisplayed()
		//isEnabled()
		//IsSelected()
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		
		//findElement() = returns Webelement
		
		//isDisplayed() - we can check display status of the element
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println("Display Status of logo "+logo.isDisplayed());  //true
		
		
		Boolean status =driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
		System.out.println(status);  //true
		
		//isEnabled() - We can check enable/disable status of the element/operational element
		Boolean InputBoxStatus= driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).isEnabled();
		System.out.println(InputBoxStatus);  //true
		
		//isSelected()- We can use to check the status of the element is selected or not
		WebElement Male_rd=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		WebElement Female_rd=driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		System.out.println("Before Selection "+Male_rd.isSelected());  //false
		
		Male_rd.click();
		System.out.println("After Selection "+Male_rd.isSelected());  //true

		driver.quit();
		
	}

}

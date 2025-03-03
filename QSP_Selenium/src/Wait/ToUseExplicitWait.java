package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseExplicitWait {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         wait.until(ExpectedConditions.elementToBeClickable(By.id("check")));
         
         driver.get("https://shoppersstack.com/products_page/23");
         driver.findElement(By.xpath("//input[@id='Check Delivery' and @name='Check Delivery']")).sendKeys("606905");

	}
 
}

package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		
//To handle frame using index
		
	/*	driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("0000000000");  */
		
//To handle frame using string name or id
		
	/*	driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("111111111");  */

		
//To handle frame using WebElement
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame("iframe");
		driver.findElement(By.id("regEmail")).sendKeys("111111111");
		
//To switch Back
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
//To click on About Us
		
		driver.findElement(By.linkText("About Us")).click();
		
		
	}

}

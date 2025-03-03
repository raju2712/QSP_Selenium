package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {

	public static void main(String[] args) {

         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
         driver.get("https://shoppersstack.com/products_page/23");
         driver.findElement(By.xpath("//input[@id='Check Delivery' and @name='Check Delivery']")).sendKeys("606905");

	}

}

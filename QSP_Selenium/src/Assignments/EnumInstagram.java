package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnumInstagram {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		 WebElement UN = driver.findElement(By.xpath("//input[@name='username']"));
		 UN.sendKeys("RAJU");
		 UN.sendKeys(Keys.CONTROL + "a");
		 UN.sendKeys(Keys.CONTROL + "c");
		 WebElement PASS = driver.findElement(By.xpath("//input[@name='password']"));
		 PASS.sendKeys(Keys.CONTROL + "v");

	}

}

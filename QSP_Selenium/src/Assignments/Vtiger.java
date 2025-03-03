package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.vtiger.com/");
		WebElement Company = driver.findElement(By.partialLinkText("Company"));
		Actions a = new Actions(driver);
		a.moveToElement(Company).perform();
		WebElement Contact = driver.findElement(By.xpath("(//a[normalize-space()='Contact Us'])[1]"));
		a.moveToElement(Contact).click().perform();
	    WebElement Number = driver.findElement(By.xpath("//p[normalize-space()='+91 9243602352']"));
	    System.out.println(Number.getText());

	}

}

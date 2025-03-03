package ShadowElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowClose {

	public static void main(String[] args) throws Exception {

		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//section[contains(text(),'X Path')]")).click();
	        driver.findElement(By.xpath("//section[contains(text(),'Shadow Root Elements')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(text(),'Close Shadow Root')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).click();
	        
	        Actions a = new Actions(driver);
	        a.sendKeys(Keys.TAB).perform();
	        a.sendKeys("Raju").perform();
	        a.sendKeys(Keys.TAB).perform();
	        a.sendKeys("Ramesh").perform();
	}

}

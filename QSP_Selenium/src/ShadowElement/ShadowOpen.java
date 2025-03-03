package ShadowElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowOpen {

	public static void main(String[] args) throws InterruptedException {

		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//section[contains(text(),'X Path')]")).click();
	        driver.findElement(By.xpath("//section[contains(text(),'Shadow Root Elements')]")).click();
	        SearchContext shadowElement1 = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
	        shadowElement1.findElement(By.cssSelector("input[type='text']")).sendKeys("Raju");
	        SearchContext shadowElement2 = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
	        shadowElement2.findElement(By.cssSelector("input[type='text']")).sendKeys("Ramesh");
	        
	}

}

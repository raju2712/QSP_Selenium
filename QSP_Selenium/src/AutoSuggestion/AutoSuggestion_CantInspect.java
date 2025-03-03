package AutoSuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_CantInspect {

	public static void main(String[] args) throws InterruptedException {

		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.get("https://www.flipkart.com/");
	        driver.findElement(By.name("q")).sendKeys("mobile");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[contains(text(),'stand')]")).click();
	}

}

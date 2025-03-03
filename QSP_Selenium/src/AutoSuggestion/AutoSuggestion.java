package AutoSuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.id("small-searchterms")).sendKeys("card");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'$100 Physical Gift Card')]")).click();
        
	}

}

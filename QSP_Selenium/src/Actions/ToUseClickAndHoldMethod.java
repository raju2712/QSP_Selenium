package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseClickAndHoldMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Raju@123456");

		WebElement EyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));

		Actions ClickAndHold = new Actions(driver);
		ClickAndHold.moveToElement(EyeIcon);
		ClickAndHold.clickAndHold().perform();
		Thread.sleep(3000);
		ClickAndHold.release().perform();
		
		ClickAndHold.contextClick();
	}
}

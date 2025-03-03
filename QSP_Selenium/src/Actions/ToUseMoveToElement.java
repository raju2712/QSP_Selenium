package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseMoveToElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.flipkart.com/");
		WebElement ElectronicsElement = driver.findElement(By.xpath("//span[text()='Electronics']"));

//To Use Action class to perform Move to Element

		Actions Move2Element = new Actions(driver);
		Move2Element.moveToElement(ElectronicsElement).perform();

	}

}

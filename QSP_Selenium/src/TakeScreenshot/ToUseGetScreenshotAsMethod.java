package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToUseGetScreenshotAsMethod {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);

		// Take screenshot of entire web page

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./ErrorShots/WoodenStreet.jpeg"); // we can also give png format
		FileHandler.copy(temp, src);

		// Take screenshot of a web element

		temp = driver.findElement(By.xpath("//img[@alt='Home Furniture Online']")).getScreenshotAs(OutputType.FILE);
		src = new File("./ErrorShots/WoodenStreetLogo.jpeg");
		FileHandler.copy(temp, src);
	}
}

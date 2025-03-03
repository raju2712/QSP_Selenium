package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zomoto {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		
		//Entire Page
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./ErrorShots/ZomotoPage.png");
		FileHandler.copy(temp, src);
		
		//Element
		
		temp = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getScreenshotAs(OutputType.FILE);
		src = new File("./ErrorShots/ZomotoLogo.png");
		FileHandler.copy(temp, src);
		
		

	}

}

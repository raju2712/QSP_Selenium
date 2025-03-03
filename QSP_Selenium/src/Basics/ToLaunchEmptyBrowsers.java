package Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchEmptyBrowsers {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();  //To open an empty chrome browser
		              //  or
	  //  WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //To maximize the chrome window
		
		driver.navigate().to("https://www.amazon.in/");
		           //or
		//driver.get("https://www.amazon.in/");
		
		Thread.sleep(6000);
		     //or
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
}

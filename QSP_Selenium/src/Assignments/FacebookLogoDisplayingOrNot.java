package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogoDisplayingOrNot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		WebElement facebookLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		//System.out.println(facebookLogo.isDisplayed());
		if(facebookLogo.isDisplayed()==true) 
		{
			System.out.println("Logo displayed");
		}
		else {
			System.out.println("Logo not displayed");
		}

	}

}

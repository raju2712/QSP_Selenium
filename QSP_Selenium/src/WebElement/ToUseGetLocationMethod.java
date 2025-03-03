package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		Point Location = driver.findElement(By.xpath("//span[@class='_2o9o_t _2pNTc_']")).getLocation();
		System.out.println(Location);
		
				

	}

}

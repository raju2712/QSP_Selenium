package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandlePractice {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/tricentis");
		Thread.sleep(3000);
		
		String ParentId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'Google+')]")).click();
		
		//Child window opened
		
		Set<String> ChildId = driver.getWindowHandles();
		
		for(String id:ChildId) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nothing");
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(ParentId);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Done");
		
		
	}

}

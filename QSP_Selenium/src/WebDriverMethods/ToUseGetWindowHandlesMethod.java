package WebDriverMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://polarbear.co.in/");
		Thread.sleep(3000);
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		driver.findElement(By.xpath("//a[@class='btn btn-small btn-optional']")).click();
		Thread.sleep(3000);
		
		Set<String> allWindowId = driver.getWindowHandles();		
		System.out.println(allWindowId); 
		
		//allWindowId.remove(parentId);	
		
		for(String Id : allWindowId ) {
			driver.switchTo().window(Id);
			//driver.close();
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

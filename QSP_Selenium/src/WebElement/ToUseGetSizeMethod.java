package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		Dimension SizeOfElement = driver.findElement(By.xpath("//img[@title='Flipkart']")).getSize();
		System.out.println(SizeOfElement);
		//System.out.println(SizeOfElement.getHeight());
		//System.out.println(SizeOfElement.getWidth());
	}

}

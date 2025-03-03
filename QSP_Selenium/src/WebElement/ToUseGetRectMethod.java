package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		Rectangle SizeOfElement = driver.findElement(By.xpath("//img[@title='Flipkart']")).getRect();
		System.out.println(SizeOfElement.getHeight());
		System.out.println(SizeOfElement.getWidth());
		System.out.println(SizeOfElement.getX());
		System.out.println(SizeOfElement.getY());

	}

}

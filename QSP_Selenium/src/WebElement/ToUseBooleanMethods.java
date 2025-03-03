package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://106.51.66.147:9007/");
		Thread.sleep(3000);
		WebElement imgSelection = driver.findElement(By.xpath("//img[@src='assets/images/logo.png']"));
		System.out.println("------Before Selection-----------");
		System.out.println(imgSelection.isSelected());
		imgSelection.click();
		System.out.println("----------After Selection----------");
		System.out.println(imgSelection.isSelected());  
		
		

	}

}

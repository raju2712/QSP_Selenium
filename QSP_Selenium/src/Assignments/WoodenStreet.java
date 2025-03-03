package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		
	/*	for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			    }
			catch(Exception e)
			{
				Thread.sleep(3000);
			}
		        }  */
		
		driver.findElement(By.xpath("//a[@href='sofas']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[normalize-space()='Berlin 3 Seater Sofa (Velvet, Indigo Blue)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
		//-----------------------1 product added-------------------------------------------
		driver.findElement(By.xpath("//a[normalize-space()='Living']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class='name'][contains(text(),'Hailey Engineered Wood Wall-Mounted Tv Unit with S')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
		//-----------------------2 product added--------------------------------------------
		driver.findElement(By.xpath("//a[@href='study-room-furniture']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class='name'][contains(text(),'Alkin Study Table with Keyboard Tray and Side Stor')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='button-cart-buy-now']")).click();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

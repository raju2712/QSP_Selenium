package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='SIGNUP']")).click();  //Selector hub
	//	driver.findElement(By.xpath("//a[test()='SIGNUP'")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raju");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("raju123@gmail.com");
		driver.findElement(By.xpath("//div[@class='col-md-6']//input[@placeholder='Password']")).sendKeys("Raju@123");
		driver.findElement(By.xpath("//input[@name='repassword']")).sendKeys("Raju@123");
		driver.findElement(By.xpath("//input[@value='Register']")).click();

	}

}

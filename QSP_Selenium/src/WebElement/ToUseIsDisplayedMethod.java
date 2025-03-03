package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		WebElement ButtonEnable = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("-----------before enabled------------");
		System.out.println(ButtonEnable.isEnabled());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Raju@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Raju@123456");
		System.out.println("----------After Enabled---------");
		System.out.println(ButtonEnable.isEnabled());
	}
}

package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearAndSumitMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement UserTextField = driver.findElement(By.id("username"));
		UserTextField.clear();
		Thread.sleep(3000);
		UserTextField.sendKeys("Raju");
		
		
		
		

	}

}

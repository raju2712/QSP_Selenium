package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {

	@DataProvider(name = "dp")
	public String[][] testData() {
		String[][] data = { { "raju@gmail.com", "Raju@123" }, { "flower@gmail.com", "Flower@123" },{ "deena@gmail.com", "Deena@123" } };
		return data;
	}

	@Test(dataProvider = "dp")
	public void getData(String email, String Password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(Password);
		Thread.sleep(2000);
		driver.quit();
	}
}

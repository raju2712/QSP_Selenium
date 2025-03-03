package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;
	String expectedLoginPage = "Demo Web Shop";
	
	@BeforeClass
	public void toLaunch() {
		driver = new ChromeDriver();
		Reporter.log("Browser got Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPage)) {
			Reporter.log("Successfully navigated to demo web shop", true);
		}else {
			Reporter.log("Failed navigated to demo web shop", true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Selenium93@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Logged In Successfully", true);
	}
	
	@AfterMethod
	public void logOut() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logged Out Successfully", true);
	}
	
	@AfterClass
	public void Close() {
		driver.quit();
		Reporter.log("Browser got closed", true);
	}
}

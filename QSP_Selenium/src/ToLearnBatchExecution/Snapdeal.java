package ToLearnBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {

	@Test(groups = "system")
	public void snapdeal() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	Reporter.log("snapdeal got executed", true);
	driver.quit();	
}}

package ToLearnBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {

	@Test(groups = "integration")
	public void flipkart() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Reporter.log("Flipkart got executed", true);
	driver.quit();	
}
	}

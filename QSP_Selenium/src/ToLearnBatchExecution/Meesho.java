package ToLearnBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {

	@Test(groups = "integration")
	public void meesho() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.meesho.com/");
	Reporter.log("meesho got executed", true);
	driver.quit();	
}}

package ToLearnBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
 
	@Test(groups = "functional")
	public void ajio() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	Reporter.log("Ajio got executed", true);
	driver.quit();	
}
	}

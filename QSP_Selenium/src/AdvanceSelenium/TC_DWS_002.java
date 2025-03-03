package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{
	
	@Test
	public void ToOpenComputersPage() {
     	driver.findElement(By.partialLinkText("Computers")).click();
	    Reporter.log("Computer page got opened", true);
	}
}

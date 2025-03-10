package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {

	String expectedData = "Books";

	@Test
	public void ToOpenBooksPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		/*
		 * if(actualData.equals(expectedData)) {
		 * Reporter.log("Succesfully navigated to books page", true); }else {
		 * Reporter.log("Failed to navigated to books page", true); }
		 */
		Assert.assertEquals(actualData, expectedData);
		Reporter.log("Succesfully navigated to books page", true);
	}
}

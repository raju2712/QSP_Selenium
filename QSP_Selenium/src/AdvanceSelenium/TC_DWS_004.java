package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass {
	
	@Test
	public void CartToBuy() {
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Reporter.log("Product successfully added to cart message displayed", true);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("Cart page is displayed along with added product", true);
		driver.findElement(By.id("termsofservice")).click();
		Reporter.log("Terms and conditions agreed", true);
		driver.findElement(By.id("checkout")).click();
	    Reporter.log("Checkout page displayed", true);
	    driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@title='Continue'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
	    driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
	    driver.findElement(By.id("input[id='driver.findElement(By.xpath(']")).click();
	    driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
	    driver.findElement(By.xpath("//input[@value='Confirm']")).click();
	    Reporter.log("Successfully ordered message displayed", true);	    
	    
	    
		
	}

}

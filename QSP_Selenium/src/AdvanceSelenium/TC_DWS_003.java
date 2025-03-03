package AdvanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{
	
	@Test
	public void addProductToCart() {
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Reporter.log("Product successfully added to cart message displayed", true);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("Cart page is displayed along with added product", true);
	}

}

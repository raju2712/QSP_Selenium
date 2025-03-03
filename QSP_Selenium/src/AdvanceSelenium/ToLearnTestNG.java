package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {
	
/*	@Test(priority = 1)                                              //Priority starts from negative values---default value is 0
	public void cricbuzz() {                                         //Example : -2,-1,0,1,2
		WebDriver driver = new ChromeDriver();                       //here -2 will execute 1stand 2 will execute last
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed", true);
		driver.quit();
	}    */
	
	@Test(invocationCount = 6 , threadPoolSize = 3)                  //invocationCount means How many times the TC have to run
	public void baskinRobbins() {                                    //Here, this TC will run 6 times but Set of 2(threadPoolSize)
		WebDriver driver = new ChromeDriver();                       //If invocationCount is 0, it will skip that TC
		driver.manage().window().maximize();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinRobbins got executed", true);
		driver.quit();
	}  
	
/*	@Test(enabled = false)                                          //Enable = true  -- means run
	public void amazon() {                                          //Enable = false -- skip
		WebDriver driver = new ChromeDriver();                      //default value is true
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		Reporter.log("amazon got executed", true);
		driver.quit();
	}
	@Test(enabled = true)
	public void baskinRobbins1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinRobbins got executed", true);
		driver.quit();
	}  */
	}

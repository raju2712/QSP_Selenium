package Assignments;

/**
 * RAJU
 */
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin { // Test Case
	public static void main(String[] args) throws InterruptedException {

		// ExpectedData
		String expectedLoginPageTitle = "Facebook – log in or sign up";
		String expectedUserName = "raju@email.com";
		String expectedPassword = "Raju@123";

		// Step 1 :- Open Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Step 2 :- Passing URL
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Successfully naviaget to facebook login page");
		} else {
			System.out.println("Failed to navigate to facebook lohin page");
		}

		// Step 3 :- Enter the UserName
		WebElement userNameTextField = driver.findElement(By.id("email"));
		userNameTextField.clear();
		userNameTextField.sendKeys(expectedUserName);
		String actualUserName = userNameTextField.getAttribute("value");
		if (actualUserName.equals(expectedUserName)) {
			System.out.println("username TextField Successfully Accepted the Data");
		} else {
			System.out.println("username TextField Failed Accepted the Data");
		}

		// Step 4 :- Enter the Password
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.clear();
		passwordTextField.sendKeys(expectedPassword);
		String actualPassword = passwordTextField.getAttribute("value");
		if (actualPassword.equals(expectedPassword)) {
			System.out.println("Password TextField Successfully Accepted the Data");
		} else {
			System.out.println("Password TextField Failed Accepted the Data");
		}

		// Step 5 :- click on Login button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		/**
		 * Once Login is done home page will display,then we have to validate
		 * ActualHomePageTitle with ExpectedHomePageTitle
		 */
		System.out.println("Successfully Navigated to Facebook HomePage");

		// Step 6 :- Close the Browser
		System.out.println("Browser succesfully closed");
		driver.quit();
	}
}

package PomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_TC_001 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();

		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("raju@gmail.com");
		lp.getPasswordTextField().sendKeys("Raju@123");
		lp.getLoginButton().click();

	}

}

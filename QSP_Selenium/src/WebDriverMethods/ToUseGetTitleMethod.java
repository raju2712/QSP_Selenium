package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTitleMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zapvi.in/");
		System.out.println(driver.getTitle());
		

	}

}

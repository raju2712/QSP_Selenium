package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetCurrentUrlMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://zapvi.in/");
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);

	}

}

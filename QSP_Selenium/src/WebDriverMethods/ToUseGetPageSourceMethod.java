package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetPageSourceMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://zapvi.in/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

}

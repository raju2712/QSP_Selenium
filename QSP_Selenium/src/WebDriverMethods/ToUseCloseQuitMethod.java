package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCloseQuitMethod {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://zapvi.in/");
		driver.close(); //Close the parent window
		driver.quit();  //Close all the windows

	}

}

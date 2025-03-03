package WebDriverMethods;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseManageMethod {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://zapvi.in/");

		Window win = driver.manage().window();
		win.maximize();
		win.minimize();
		win.fullscreen();
		win.getSize();
		win.getPosition();

	}

}

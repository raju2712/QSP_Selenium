package WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleMultipleWebElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/");
		List<WebElement> NavEle = driver.findElements(By.xpath("//div[@id='subtopnav']/a"));
		for(WebElement Ele : NavEle) {
			System.out.println(Ele.getText());
		}

	}

}

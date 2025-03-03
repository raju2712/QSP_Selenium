package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("https://licindia.in/");
		driver.findElement(By.partialLinkText("Login")).click();

//To handle confirmation popup

		Alert PopUp = driver.switchTo().alert();
		System.out.println(PopUp.getText());
		PopUp.accept();
		// or
		// PopUp.dismiss();

	}

}

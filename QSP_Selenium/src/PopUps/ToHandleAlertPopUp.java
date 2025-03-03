package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

//To handle Frame

		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();

//To handle Alert Pop-Up

		Thread.sleep(2000);
		Alert PopUp = driver.switchTo().alert();
		System.out.println(PopUp.getText());
		PopUp.accept();
		// or
		// PopUp.dismiss();

	}

}

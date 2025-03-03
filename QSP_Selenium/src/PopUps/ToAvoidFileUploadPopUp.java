package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidFileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
//To upload file
		
		//Search for input tag below the element location in inspect page and take locator from there
		driver.findElement(By.id("resumeUpload")).sendKeys("E:\\...R R\\Resumes\\Resume contents.docx");

	}

}

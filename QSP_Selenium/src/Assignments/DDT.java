package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./testData/demoWebShop.properties");   //-----1
		Properties prop = new Properties();                                               //-----2
		prop.load(fis);                                                                   //-----3
		String Url = prop.getProperty("URL");
		String FirstName = prop.getProperty("FN");
		String LastName = prop.getProperty("LN");
		String Email = prop.getProperty("Email");
		String Password = prop.getProperty("Password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(Url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Password);	

	}

}

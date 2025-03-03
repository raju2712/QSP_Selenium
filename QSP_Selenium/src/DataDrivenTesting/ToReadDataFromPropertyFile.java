package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

//Create an object of FileInputStraem

		FileInputStream fis = new FileInputStream("./testData/testData.properties");

//Create on object of Properties file

		Properties prop = new Properties();

//Call Method

		prop.load(fis);
		String a = prop.getProperty("url");
		String b = prop.getProperty("username");
		String c = prop.getProperty("password");

//Script

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(a);
		driver.findElement(By.id("email")).sendKeys(b);
		driver.findElement(By.id("pass")).sendKeys(c);

	}

}

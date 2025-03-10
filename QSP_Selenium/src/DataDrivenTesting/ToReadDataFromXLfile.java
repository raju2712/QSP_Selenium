package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromXLfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//Create an object of FileInputStraem
		
				FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
				
//Create on object of Properties file
				
				Workbook wb = WorkbookFactory.create(fis);
				
//Call Method
				
				String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();        //toString (or) getStringCellValue();
				String USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
				String PASSWORD = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();
				
//String
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get(URL);
				driver.findElement(By.id("email")).sendKeys(USERNAME);
				driver.findElement(By.id("pass")).sendKeys(PASSWORD);
	}
}

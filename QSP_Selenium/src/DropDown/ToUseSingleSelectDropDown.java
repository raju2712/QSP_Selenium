package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseSingleSelectDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/reg/");

// Identify Drop Down

		/*
		 * driver.findElement(By.id("day")).click();
		 * driver.findElement(By.xpath("//option[@value='27']")).click();
		 */
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));

//To Handle Drop Down

		Select daySelect = new Select(dayDropDown);
		Select monthSelect = new Select(monthDropDown);
		Select yearSelect = new Select(yearDropDown);

//Call Method

		daySelect.selectByValue("27");
		monthSelect.selectByValue("1");
		yearSelect.selectByValue("2000");

//To check whether the drop down is multiSelect or singleSelect	

		System.out.println(monthSelect.isMultiple()); // Output in boolean format

//To get every options in the drop down

		List<WebElement> allMonths = monthSelect.getOptions();
		for (WebElement MonthNames : allMonths) {
			System.out.println(MonthNames.getText());
		}

	}
}

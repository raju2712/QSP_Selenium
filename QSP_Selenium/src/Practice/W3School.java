package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();   //Void
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("search2")).sendKeys("SQL",Keys.ENTER);   //Web Element
		System.out.println(driver.getTitle());   //String
		System.out.println(driver.getCurrentUrl());    //String
		System.out.println(driver.getPageSource());   //String
		Window win = driver.manage().window();     
		win.minimize();
		win.maximize();
		win.getSize();   //Dimension
		win.getPosition();   //Point
		win.getSize();    //Dimension
		//win.setPosition(new Dimension(56, 66));
		Navigation nav = driver.navigate();
		nav.refresh();
		nav.back();
		nav.forward();
		driver.getWindowHandle();
		
		
		 
		

	}

}

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindAllignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		int AllignmentOfUsernmae = driver.findElement(By.id("email")).getRect().getX();
		System.out.println(AllignmentOfUsernmae);
		int AllignmentOfPass = driver.findElement(By.id("pass")).getRect().getX();
		System.out.println(AllignmentOfPass);

		if(AllignmentOfUsernmae==AllignmentOfPass) {
			System.out.println("Properly Alligned");
		}
		else {
			System.out.println("Not Properly Alligned");
		}
	}

}

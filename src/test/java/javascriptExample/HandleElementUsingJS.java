package javascriptExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleElementUsingJS {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		System.out.println("closing an application");
		driver.close();
		driver.quit();
	}
	
	
		
	
	@Test
	public void verifypromptAlert() throws Exception {
		
		
		
		
		
		
		
		WebElement lnkHotel = driver.findElement(By.cssSelector("[id='submit']"));
//		lnkHotel.click();
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		
		JS.executeScript("arguments[0].click()", lnkHotel);

	}

}

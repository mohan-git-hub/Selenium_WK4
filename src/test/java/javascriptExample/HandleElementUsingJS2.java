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

public class HandleElementUsingJS2 {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
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
		
		
		
		
		
		
		
		WebElement ele = driver.findElement(By.name("lname"));
//		ele.sendKeys("enter last name");
//		lnkHotel.click();
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		
//		JS.executeScript("arguments[0].value='enter value'", ele);
		
//		JS.executeScript("arguments[0].value='enter value'", ele, "enter last name", "enter last name ......");
		
		JS.executeScript("arguments[0].value=arguments[2]", ele, "enter last name", "enter last name ......");
		
		

	}

}

package takeScreenshotExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		driver.get("https://www.amazon.in/");
		
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
		
		
		
		
		
		
		
		WebElement seaarchInputbox = driver.findElement(By.name("field-keywords"));
		seaarchInputbox.sendKeys("iphone 15 pro");
		
		WebElement searchButotn = driver.findElement(By.cssSelector("[type=\"submit\"]"));
		searchButotn.click();
		
		
		Thread.sleep(3000);
		//JavascriptExecutor JS = (JavascriptExecutor) driver;
		//JS.executeScript("arguments[0].value=arguments[2]", ele);
//		TakesScreenshot TS = (TakesScreenshot) driver;
		
		captureScreenShot("iphone_15_pro_SearchResult");

	}
	
	
	
	public void captureScreenShot(String filename) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		File screenshotFile = (ts).getScreenshotAs(OutputType.FILE);
		
		File target = new File(".\\screenshotCoforge\\"+filename+".png");
		
		FileUtils.copyFile(screenshotFile, target);
	}

}

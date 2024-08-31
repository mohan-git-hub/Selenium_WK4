package frameExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleFrameExample2 {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
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
		
		//index
//		driver.switchTo().frame(0);
		//id or name
//		driver.switchTo().frame("iframe_heading");
		//webelement
//		WebElement myFrame = driver.findElement(By.cssSelector("[data-src='../../demoSite/practice/droppable/photo-manager.html']"));	
		
		WebElement myFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));	
		
		driver.switchTo().frame(myFrame);
		
		
		
		//click on button
		
//		WebElement img3 = driver.findElement(By.cssSelector("[src=\"images/high_tatras3_min.jpg\"]"));
		
		WebElement img3 = driver.findElement(By.cssSelector("[src*=\"tatras3\"]"));
		
		
		String heading = img3.getAttribute("alt");    //Planning the ascent
		System.out.println("Heading Text are: " + heading);
		
		
		
		
	}

}

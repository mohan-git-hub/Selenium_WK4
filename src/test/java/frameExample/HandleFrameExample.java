package frameExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleFrameExample {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/PurchaseApp/");
		
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
		WebElement myFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(myFrame);
		
		
		
		//click on button
		String heading = driver.findElement(By.cssSelector("[id='heading']")).getText();
		System.out.println("Heading Text are: " + heading);
		
		
		
		
	}

}

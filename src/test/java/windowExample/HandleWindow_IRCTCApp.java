package windowExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleWindow_IRCTCApp {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
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
		
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow: " + parentWindow);
		
			
		
//		WebElement lnkContactUS = driver.findElement(By.partialLinkText("CONTACT US"));
//		lnkContactUS.click();
		
		WebElement lnkHotel = driver.findElement(By.partialLinkText("HOT"));
		lnkHotel.click();
////		
		
		//dialog ------- window
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println("Window count: " + allWin.size());
		
		
		System.out.println("Applicaation Title: " + driver.getTitle());
		
		
		
		  String win1 = (String)allWin.toArray()[0]; 
		  String win2 = (String)allWin.toArray()[1];
		  
		  
		  System.out.println("win1 : " + win1); 
		  System.out.println("win2 : " + win2);
		  
		  
		  Thread.sleep(5000);
		  
		  
//		  String AppTitle = 
		  
		  
		  
		  //switch to Hotel Window
		  driver.switchTo().window(win2);
		  System.out.println("After switching to win2, application Title: " + driver.getTitle());
		  
		  
		  //click on login button
		  driver.findElement(By.cssSelector("[data-bs-target=\"#LoginModal\"]")).click();
		  
		  Thread.sleep(7000);
		
		//switch to parent Window
		  driver.switchTo().window(win1);
		  System.out.println("After switching to win1, application Title: " + driver.getTitle());
		  
			WebElement lnkContactUS = driver.findElement(By.partialLinkText("CONTACT US"));
			lnkContactUS.click();
			
			Thread.sleep(7000);
			//switch to Hotel Window
			  driver.switchTo().window(win2);
			  System.out.println("After switching to win2, application Title: " + driver.getTitle());
		  
			//click on login button
			  driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}

package windowExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleWindowExample {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/SeleniumApp1/TrainReservation/login.html");
		
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
		
			
		
		WebElement googleSignup = driver.findElement(By.cssSelector("[id=gmailsignin]"));
		googleSignup.click();
//		
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println("Window count: " + allWin.size());
		
		
		System.out.println("Applicaation Title: " + driver.getTitle());
		
		
		String win1 = (String)allWin.toArray()[0];
		String win2 = (String)allWin.toArray()[1];
		
		
		System.out.println("win1 : " + win1);
		System.out.println("win2 : " + win2);
		
		
		Thread.sleep(5000);
		
		//google window
		driver.switchTo().window(win2);
		System.out.println("Applicaation Title after switch to win2: " + driver.getTitle());
		
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("abhi@coforge.com");
		
		
		
	}

}

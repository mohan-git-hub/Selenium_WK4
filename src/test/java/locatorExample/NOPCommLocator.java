package locatorExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPCommLocator {
	
	WebDriver driver;
	
	@Before
	public void launchApp() {
		
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		driver.manage().window().maximize();
		
	}
	
	
	@After
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		driver.close();
	}

	
	
	@Test
	public void locatorExample() throws Exception {
		
		
		System.out.println("application title before login: " + driver.getTitle());
		//locator
//		id
//		class
//		name
//		tagname
//
//		linkText
//		partialLinkText
//
//
//		xpath
//		css selector

		
		
		//ID
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		
		//class
		driver.findElement(By.className("password")).clear();
		driver.findElement(By.className("password")).sendKeys("admin");
		
		
		//name
		driver.findElement(By.name("RememberMe")).click();
		
		
		//Tagname
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(3000);
		//validation Step
		System.out.println("application title after login: " + driver.getTitle());
		
		
		//linkText
//		driver.findElement(By.linkText("Logout")).click();     //exact text
		
		
		
		//PartialLink
		driver.findElement(By.partialLinkText("ogou")).click();
		
		
		
		//XPATH
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		Thread.sleep(3000);
		//CSS Selector
		driver.findElement(By.cssSelector("[id='RememberMe']")).click();
		
		
	}
}

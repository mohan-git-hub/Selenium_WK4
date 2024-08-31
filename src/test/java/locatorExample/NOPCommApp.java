package locatorExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPCommApp {
	
	WebDriver driver;
	
	@Test
	public void verifyLoginTest() throws Exception {
		
		
		//launch a chrome browser
		driver = new ChromeDriver();     //session get created
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(4000);
		
		
		//identification
		
		//email
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("ankit@coforge.com");
		
		
		
		//ID ---- checkbox
		driver.findElement(By.id("RememberMe")).click();
		
		
		
		
		
		
		Thread.sleep(5000);
//		driver.close();
		
		
	}
	
	
	

}

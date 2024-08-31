package crossBrowserTestExample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Constants;

public class NOPCommTest extends BaseTest{
	
	
	
		
	
	@Test
	public void verifypromptAlert() throws Exception {
		
		

		driver.findElement(By.cssSelector("input#Email")).clear();;
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys(Constants.adminEmail);
		
		
		driver.findElement(By.cssSelector("input#Password")).clear();;
		
		driver.findElement(By.cssSelector("input#Password")).sendKeys(Constants.adminPass);
		
		
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
		
		
		driver.findElement(By.partialLinkText("Logo")).click();
		
		Thread.sleep(3000);
		
	}

}

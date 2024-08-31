package logExample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Constants;

public class NOPCommTest extends BaseTest{
	
	
	
		
	
	@Test
	public void verifypromptAlert() throws Exception {
		
		log.info("clear the email value.");

		driver.findElement(By.cssSelector("input#Email")).clear();;
		log.info("enter email value: " + conf.getAdminEmail());
		driver.findElement(By.cssSelector("input#Email")).sendKeys(Constants.adminEmail);
		
		log.info("clear the email value.");
		driver.findElement(By.cssSelector("input#Password")).clear();;
		log.info("enter password value: " + Constants.adminPass);
		driver.findElement(By.cssSelector("input#Password")).sendKeys(Constants.adminPass);
		
		log.info("click on rem checkbox");
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		
		log.info("click on login button");
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		log.info("application title after login: " + driver.getTitle());
		log.info("validation, is Dashbard value present into title : " + driver.getTitle().contains("Dashboard"));
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
		
		log.info("click on logout button");
		driver.findElement(By.partialLinkText("Logo")).click();
		
		Thread.sleep(3000);
		log.info("application title after logout: " + driver.getTitle());
	}

}

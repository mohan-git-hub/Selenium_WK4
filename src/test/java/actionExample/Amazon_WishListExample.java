package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_WishListExample {
	
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
		
		WebElement SignIn = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		//SignIn.click();;
//		
		WebElement WishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish')]"));

		
		
//		ActionsExample act = new ActionsExample(driver);
//		
//		act.click();
		
		Actions act = new Actions(driver);
		
//		//app1
//		act.moveToElement(SignIn).perform();;
//		act.moveToElement(WishList).perform();
//		act.click().perform();
//		
//		System.out.println("Application title: " + driver.getTitle());
//		
//		
//		Thread.sleep(5000);
//		driver.navigate().back();
//		Thread.sleep(5000);
		
		
		//app2
//		act.moveToElement(SignIn).moveToElement(WishList).click().perform();
		
		
//		//app3
		act.moveToElement(SignIn).click(WishList).perform();
		
		
		Thread.sleep(3000);
		System.out.println("*************application title**************** : " + driver.getTitle());
//		
//		
//		
//		//app4
//		act.moveToElement(SignIn).click(WishList).build().perform();
		
	}
	
	
	
	

}

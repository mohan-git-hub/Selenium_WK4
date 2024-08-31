package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContextClickDoubleClickTest {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
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
	
	
		
	
	@Test(enabled = false)
	public void verifyRightClick() throws Exception {
		
		WebElement btnRightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		WebElement btnDelete = driver.findElement(By.xpath("//span[contains(text(),'Del')]"));
		WebElement btnDoubleClick = driver.findElement(By.xpath("//*[contains(text(),'Dou')]"));
		
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(btnRightClick).contextClick().perform();
		
		act.contextClick(btnRightClick).perform();
		
		
//		//click on Delete
//		act.click(btnDelete).perform();
//		
////		btnDelete.click();
//		
//		driver.switchTo().alert().dismiss();
		
	}
	
	
	
	@Test
	public void verifyDoubleClick() throws Exception {
		
		WebElement btnRightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		WebElement btnDelete = driver.findElement(By.xpath("//span[contains(text(),'Del')]"));
		WebElement btnDoubleClick = driver.findElement(By.xpath("//*[contains(text(),'Dou')]"));
		
		
		Actions act = new Actions(driver);
		
		act.doubleClick(btnDoubleClick).perform();
		
		
		Thread.sleep(3000);
		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}

}

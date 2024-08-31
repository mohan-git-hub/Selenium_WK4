package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDropExample2 {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("http://webapps.tekstac.com/OnlineShopping/fashion.html");
		
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
		
//		WebElement myFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));	
//		driver.switchTo().frame(myFrame);
		
		
		//element are inside frame
		WebElement Jacket = driver.findElement(By.cssSelector("#Jackets"));
		WebElement basket = driver.findElement(By.xpath("//p[contains(text(),'Dress Names into')]"));
		
		
		Actions act = new Actions(driver);
		
		//app1
		act.dragAndDrop(Jacket, basket).perform();;
		
		
		
		
	}

}

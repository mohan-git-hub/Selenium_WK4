package testExample;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjectModel.LoginPage;

public class BaseTest {
	WebDriver driver;
	LoginPage lp;
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
		
		
		//pages Object
		lp = new LoginPage(driver);
		
		
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		System.out.println("closing an application");
		driver.close();
		driver.quit();
	}

}

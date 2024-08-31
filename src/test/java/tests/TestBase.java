package tests;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;

public class TestBase {
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching an application");
		
		
//		String headless = "";
//		
//		//with headless
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--headless");
//		driver = new ChromeDriver(opt);      //launching 
		
		
		//without headless
		driver = new ChromeDriver();      //launching 
		
		
		
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
		
		
		//Page Object
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

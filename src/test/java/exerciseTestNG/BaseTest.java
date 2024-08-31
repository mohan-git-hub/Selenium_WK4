package exerciseTestNG;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	//JUNIT   ------ > TestNG
	//pre-condition ----- BeforeSuite ---BeforeTest ---
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		System.out.println("closing an application");
//		driver.close();
//		driver.quit();
	}

}

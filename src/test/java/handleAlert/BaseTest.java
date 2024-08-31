package handleAlert;

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
	public void launchApp() {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		driver.manage().window().maximize();
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		System.out.println("closing an application");
		driver.close();
		driver.quit();
	}

}

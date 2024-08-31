package exercise;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void launchApp() {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		driver.manage().window().maximize();
	}
	
	
	@After
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		System.out.println("closing an application");
		driver.close();
		driver.quit();
	}

}

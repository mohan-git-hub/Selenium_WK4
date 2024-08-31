package crossBrowserTestExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.Constants;

public class BaseTest {
	
	WebDriver driver;
	
	
	
	@Parameters("coforge_br")
	@BeforeTest
	public void launchApp(String brFromXML) throws Exception {
		
	
//		//execute test on chrome browser
//		driver = new ChromeDriver();
		
		
		//execute test on edge browser
//		driver = new EdgeDriver();
		
		System.out.println("access browser value from Constant: " + Constants.browser);
		System.out.println("access browser value from XML file: " + brFromXML);
		
//		String br = Constants.browser;
		String br = brFromXML;
		
		if(br.equalsIgnoreCase("chrome")) {
			
			System.out.println("executing test on chrome browser");
			driver = new ChromeDriver();
		}
		
		else if(br.equalsIgnoreCase("edge")) {
			System.out.println("executing test on edge browser");
			driver = new EdgeDriver();
		}
		
		else if(br.equalsIgnoreCase("firefox")) {
			System.out.println("executing test on firefox browser");
			driver = new FirefoxDriver();
		}
		else {
			
			System.out.println("executing test on DEFAULT browser: CHROME");
			driver = new ChromeDriver();
		}
		
		
		//===============================================================//
		
		driver.get(Constants.appURL);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}
	


}

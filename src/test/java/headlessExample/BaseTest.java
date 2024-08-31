package headlessExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;
//import utility.ReadConfig_Coforge;

public class BaseTest {
	
	WebDriver driver;
//	ReadConfig_Coforge conf;
	Logger log;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		log = Logger.getLogger("nopComm Application");
		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		
		
		
		log.info("---------------info-------------");
		log.warn("---------------warn-------------");
		log.error("---------------error-------------");
		
		
		
		
//		conf = new ReadConfig_Coforge();
		
		
		
		//app1
		//driverpath
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		
		
		//GUI- non-headless mode
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		
		//headless mode
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		
		
		
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
		
		log.info("launching chrome browser");
		
		
		driver.manage().window().maximize();
		
		
		driver.get(Constants.nop_app);
		
		log.info("launching application: " + Constants.nop_app);
		
		Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void closingApp() throws Exception {
		
		log.info("closing an application");
		Thread.sleep(5000);
		driver.close();
		
	}

}

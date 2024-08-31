package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;
import utility.ReadConfig;

public class BaseTest {
	
	WebDriver driver;
	Logger log;
	ReadConfig conf;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		conf = new ReadConfig();
		
		
		
		log = Logger.getLogger("NOP Comm Application");
//		PropertyConfigurator.configure("C:\\Users\\91995\\eclipse-workspace\\com.Coforge.weekend.july2024\\testData\\log4j.properties");
//		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		PropertyConfigurator.configure("./testData/log4j.properties");
		
		
		log.info("============info==============");
		log.warn("============warn==============");
		log.error("============error==============");
		
		
		
//		Constants con = new Constants();
//		String url = con.appURL;
		
		System.out.println("********************: " + Constants.appURL);

		log.info("============launching a chrome browser============");
		driver = new ChromeDriver();
		log.info("launching an application: " + Constants.appURL);
		log.info("=========================log details================================");
		log.info("accessing value from config file: " + conf.getAppURL());
		log.info("accessing value from config file: " + conf.getAdminEmail());
		log.info("accessing value from config file: " + conf.getAdminPass());
		
		log.info("=========================log details================================");
		
		
		
		
		driver.get(Constants.appURL);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		log.info("============closing an application================");
		driver.close();
		driver.quit();
	}
	

	//@Test
	public void verifyTest() {
		
		
	}
}

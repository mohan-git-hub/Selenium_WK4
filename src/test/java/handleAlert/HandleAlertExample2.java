package handleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleAlertExample2 {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("C:\\Users\\91995\\Desktop\\rajesh\\testData\\Test.html");
		
		driver.manage().window().maximize();
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		System.out.println("closing an application");
		driver.close();
		driver.quit();
	}
	
	@Test(enabled = false)
	public void verifySimpleAlert() throws Exception {
		
		
		//click on button
		driver.findElement(By.cssSelector("[onclick='myFunction1()']")).click();
		
		
		
		Thread.sleep(3000);
		
		//Alert/Windows/Iframe  ------ driver.switchTo()
		
		//handle an alert
		
		
		
		//Alert
		//accept ---- ok
		//disiss ---- cancel
		//gettext 
		//sendKeys
		
//		int x = 10;
		Alert simpleAlert = driver.switchTo().alert();
		
		
		
		String alerttext = simpleAlert.getText();
		System.out.println("Alert Text are: " + alerttext);
		
		simpleAlert.accept();
		
	}
	
	
	

//	@Test
	public void verifyConfirmAlert() throws Exception {
		
		
		//click on button
		driver.findElement(By.cssSelector("[onclick='myFunction()']")).click();
		
		
		
		Thread.sleep(3000);
		
		//Alert/Windows/Iframe  ------ driver.switchTo()
		
		//handle an alert
		
		
		
		//Alert
		//accept ---- ok
		//dismiss ---- cancel
		//gettext 
		//sendKeys
		
//		int x = 10;
		Alert confirmAlert = driver.switchTo().alert();
		
		
		
		String alerttext = confirmAlert.getText();
		System.out.println("Alert Text are: " + alerttext);
		
//		confirmAlert.accept();
		confirmAlert.dismiss();
		
	}
	
	
	
	@Test
	public void verifypromptAlert() throws Exception {
		
		
		//click on button
		driver.findElement(By.cssSelector("[onclick='generatePromptBox()']")).click();
		
		
		
		Thread.sleep(3000);
		
		//Alert/Windows/Iframe  ------ driver.switchTo()
		
		//handle an alert
		
		
		
		//Alert
		//accept ---- ok
		//dismiss ---- cancel
		//gettext 
		//sendKeys
		
//		int x = 10;
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		String alerttext = promptAlert.getText();
		System.out.println("Alert Text are: " + alerttext);   //Please enter your name:
		
		
		Thread.sleep(3000);
		promptAlert.sendKeys("Sushil kumar gupta");
		Thread.sleep(3000);
		
		
		promptAlert.accept();
		Thread.sleep(3000);
//		promptAlert.dismiss();
		
	}

}

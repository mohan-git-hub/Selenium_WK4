package handleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleAlertExample extends BaseTest{
	
	
	
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
		driver.findElement(By.cssSelector("[onclick='myFunctionf()']")).click();
		
		
		
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
		System.out.println("Alert Text are: " + alerttext);   //Your Name Please
		
		
		Thread.sleep(3000);
		promptAlert.sendKeys("abhishek Gupta");
		Thread.sleep(3000);
		
		
		promptAlert.accept();
//		promptAlert.dismiss();
		
	}

}

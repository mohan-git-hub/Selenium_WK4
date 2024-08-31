package controlExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropdownExample2 extends BaseTest{
	
	
	@Test
	public void verifyDropdownTest() throws InterruptedException {
		
		
		WebElement countryList = driver.findElement(By.cssSelector("[name='FromLB']"));
		
		
		Select list = new Select(countryList);
		
		
		
		list.selectByIndex(0);					
		list.selectByIndex(1);
		
		Thread.sleep(2000);
		list.selectByValue("India");			//India
		
		Thread.sleep(2000);
		list.selectByVisibleText("Germany");	//Germany
		
		
		Thread.sleep(5000);
		
		list.deselectAll();
		
		Thread.sleep(5000);
		
		
		list.selectByIndex(0);					
		list.selectByIndex(1);
		
		Thread.sleep(2000);
		list.selectByValue("India");			//India
		
		Thread.sleep(2000);
		list.selectByVisibleText("Germany");	//Germany
		
		
		Thread.sleep(5000);
		list.deselectByValue("Germany");
		list.deselectByVisibleText("USA");
	}
	
	

}

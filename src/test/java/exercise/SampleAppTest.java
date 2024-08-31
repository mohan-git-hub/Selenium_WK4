package exercise;

import org.junit.Test;
import org.openqa.selenium.By;

public class SampleAppTest extends BaseTest{
	
	
	@Test
	public void verifyInputBoxTest() {
		
		driver.findElement(By.cssSelector("[name='fname']")).sendKeys("enter value");
		
		
	}

}

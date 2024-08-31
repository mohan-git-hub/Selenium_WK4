package controlExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class handleInputBox extends BaseTest{
	
	
	@Test
	public void verifyInputBoxTest() {
		
		driver.findElement(By.cssSelector("[name='fname']")).sendKeys("enter value");
		
		
	}

}

package exerciseTestNG;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleAppTest extends BaseTest{
	
	
	@Test
	public void verifyInputBoxTest() {
		
		
		driver.findElement(By.cssSelector("[id='submit']")).click();
		
		
	}

}

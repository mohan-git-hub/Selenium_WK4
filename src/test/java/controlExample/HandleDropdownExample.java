package controlExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleDropdownExample extends BaseTest{
	
	
	@Test
	public void verifyDropdownTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select/option[text()='Opel']")).click();;
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[value='UK']")).click();;
		
		
	}
	
	

}

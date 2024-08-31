package controlExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleCheckboxRadioButton extends BaseTest{
	
	
	@Test
	public void verifyCheckBoxTest() {
		
		driver.findElement(By.cssSelector("[value=\"Boat\"]")).click();;
		driver.findElement(By.cssSelector("[value='Car']")).click();;
		
	}
	
	@Test
	public void verifyRadioBoxTest() {
		
		driver.findElement(By.cssSelector("[value='female']")).click();;
		
		
	}

}

package controlExample;

import java.util.List;
import java.util.Set;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleCheckboxFindElements extends BaseTest{
	
	
	@Test
	public void verifyCheckBoxTest() {
		
		
		WebElement chk = driver.findElement(By.cssSelector("[type='checkbox']"));
		chk.click();;				//matches ---3 , it will perform action on first element
//	
//		
//		
//		driver.findElements(By.cssSelector("[type='checkbox']")).get(1).click();;
//		driver.findElements(By.cssSelector("[type='checkbox']")).get(2).click();;
		
		
//		Set<String> allwindow = driver.getWindowHandles();
//		
//		List<WebElement> allCheckbox = driver.findElements(By.cssSelector("[type='checkbox']"));
		
		
	}
	
	public void SelectAllCheckbox() {
		
		
		List<WebElement> allCheckbox = driver.findElements(By.cssSelector("[type='checkbox']"));
		
		
		
		int checkboxCount = driver.findElements(By.cssSelector("[type='checkbox']")).size();
		System.out.println("Checkbox Count are: " + checkboxCount);
		
		
		
		for (int i = 0; i < checkboxCount; i++) {
			
			
			driver.findElements(By.cssSelector("[type='checkbox']")).get(i).click();
			
		}
	}
	
	

}

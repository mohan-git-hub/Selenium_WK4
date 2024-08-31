package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		
		driver = rdriver;
//		this.driver = rdriver;
		
	}
	
	//identification//properties
	By Email = By.cssSelector("input#RememberMe");
	By Email1 = By.cssSelector("[for=\"Email\"]");
	By txtPass = By.cssSelector("input#RememberMe");
	By chk_rem = By.cssSelector("input#RememberMe");
	By btnLogin = By.cssSelector("input#RememberMe");
	By btnLogout = By.cssSelector("input#RememberMe");
	
	
	
	
	
	
	public void enterEmail() {
		
		driver.findElement(By.cssSelector("input#RememberMe")).sendKeys("test@test.com");
	}
	
	public void enterEmail(String email) {
		
		driver.findElement(By.cssSelector("input#RememberMe")).sendKeys(email);
	}
	
	
	public void entervalue(By locator, String email) {
		
		driver.findElement(locator).sendKeys(email);
	}
	
	
	
	public void clickRemCheckbox() {
		
		driver.findElement(chk_rem).click();
	}

	
	
	public boolean verifyRemCheckboxSelected() {
		
		return driver.findElement(chk_rem).isSelected();
	}
	
	public boolean verifyEmailLabel() {
		
		return driver.findElement(Email).isDisplayed();
	}
	
	
	public boolean verifyLabel(By locator) {
		
		return driver.findElement(locator).isDisplayed();
	}
	
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//import junit.framework.Assert;

public class LoginPageWithoutFactory {

	WebDriver driver;

	public LoginPageWithoutFactory(WebDriver driver) {

		this.driver = driver;

	}

	// Identification

	By txtEmail = By.cssSelector("input#Email");
	By txtpass = By.cssSelector("input#Password");
	By chkRem = By.xpath("//input[@name='RememberMe']");
	By btnLogin = By.tagName("button");
	By btnLogout = By.partialLinkText("Logo");

	// methods

	public void enterEmail(String email) {

		driver.findElement(txtEmail).clear();
		;
		driver.findElement(txtEmail).sendKeys(email);

	}

	public void enterPass(String pwd) {

		driver.findElement(txtpass).clear();
		;
		driver.findElement(txtpass).sendKeys(pwd);

	}
	
	
	public void clickRemCheckbox() {

		driver.findElement(chkRem).click();

	}
	
	public void clickLoginbutton() {

		driver.findElement(btnLogin).click();

	}
	
	public void clickLogoutButton() {

		driver.findElement(btnLogout).click();

	}

	public void verifyEmailInputboxPresent() {

		driver.findElement(txtEmail).isDisplayed();

	}
	
	
	public void verifyApplicationTitle(String expTitle) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);

	}
	
	
	
	public void login(String email, String pwd) {

		enterEmail(email);
		enterPass(pwd);
		clickLoginbutton();
		
	}
}

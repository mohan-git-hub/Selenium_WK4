package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import junit.framework.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		
		System.out.println("===============page factory concept==================");
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Identification

//	By txtEmail = By.cssSelector("input#Email");
//	By txtpass = By.cssSelector("input#Password");
//	By chkRem = By.xpath("//input[@name='RememberMe']");
//	By btnLogin = By.tagName("button");
//	By btnLogout = By.partialLinkText("Logo");

	
	@FindBy(css = "input#Email")
	WebElement txt_Email;
	
	@FindBy(css = "input#Password")
	WebElement txt_Pass;
	
	@FindBy(xpath  = "//input[@name='RememberMe']")
	WebElement chk_rem;
	
	@FindBy(tagName  = "button")
	WebElement btn_Login;
	
	@FindBy(partialLinkText  = "Logo")
	WebElement btn_Logout;
	
	
	
	
	// methods

	public void enterEmail(String email) {

		txt_Email.clear();
		txt_Email.sendKeys(email);

	}
	
	
//	public void enterEmailUsing_generic(String email) {
//
//		enterValue(txt_Email, email);
//
//	}
	

	public void enterPass(String pwd) {

		txt_Pass.clear();

		txt_Pass.sendKeys(pwd);

	}
	
	
	public void clickRemCheckbox() {

		chk_rem.click();

	}
	
	public void clickLoginbutton() {

		btn_Login.click();

	}
	
	public void clickLogoutButton() {

		btn_Logout.click();

	}

	public void verifyEmailInputboxPresent() {

		txt_Email.isDisplayed();

	}
	
	
	public void verifyApplicationTitle(String expTitle) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);

	}
	
	
	public void enterValue(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}
	
	
	
	public void login(String email, String pwd) {

		enterEmail(email);
		enterPass(pwd);
		clickLoginbutton();
		
	}
}

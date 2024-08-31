package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase{
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		System.out.println("============================: " + driver.getTitle());
		lp.enterEmail("admin@yourstore.com");
		lp.enterPass("admin");
		lp.clickRemCheckbox();
		
		
		lp.clickLoginbutton();
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		System.out.println("==============after login==============: " + driver.getTitle());
		
		lp.clickLogoutButton();
		lp.verifyApplicationTitle("Your store. Login");
		System.out.println("===========after logout=================: " + driver.getTitle());
	}
	
	
//	@Test
	public void verifyLoginFeature1() throws Exception {
		
//		lp.enterEmail("admin@yourstore.com");
//		lp.enterPass("admin");
//		lp.clickRemCheckbox();
//		
//		
//		lp.clickLoginbutton();
		System.out.println("=============login method========================");
//		lp.login("admin@yourstore.com", "admin");
//		
//		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
//		
//		lp.clickLogoutButton();
//		lp.verifyApplicationTitle("Your store. Login");
	}
	

}

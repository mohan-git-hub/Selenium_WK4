package exercise;

import org.openqa.selenium.WebDriver;

public class ActionsExample {

	public ActionsExample(WebDriver ele) {
		
		System.out.println("=======inside a constructor================" + ele);
		
	}
	
	
	public void click() {
		
		System.out.println("=======click on element=============");
	}

}

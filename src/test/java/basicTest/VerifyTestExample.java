package basicTest;

import org.testng.annotations.Test;

public class VerifyTestExample {
	
	
	
	@Test
	public void verifyTest() {
		
		SelectExample list = new SelectExample("greeting message !!");
		list.selectByIndex();
		
		
	}

}

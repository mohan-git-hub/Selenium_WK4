package basicTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonTest {
	
	
	//ctrl+shift+O   ----- add auto import or remove unused import
	
	@After
	public void closeApp() {
		
		System.out.println("===============closeApp===============");
		
	}
	
	
	@Test
	public void verifySerachTest() {
		
		System.out.println("test execution started......");
		
	}
	
	
	@Before
	public void launchApp() {
		
		System.out.println("===============launchApp===============");
		
	}
	
	
	

}

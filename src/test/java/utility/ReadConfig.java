package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;

	public ReadConfig() throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\configExample.properties");
		
		prop = new Properties();
		
		prop.load(fis);
		
		
	}
	
	
	public String getAppURL() {
		
		return prop.getProperty("nopApp");
		
	}
	
	
	public String getAdminEmail() {
		
		return prop.getProperty("email");
		
	}
	
	public String getAdminPass() {
		
		return prop.getProperty("password");
		
	}
	

}

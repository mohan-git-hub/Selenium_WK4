package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigExample {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\configExample.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		
		
//		String password = prop.getProperty("passwordValue");
		String password = prop.getProperty("passwordValue", "DefaultPassword");

		System.out.println("application URL: " + prop.getProperty("nopApp"));
		System.out.println("email: " + prop.getProperty("email"));
		System.out.println("password: " + prop.getProperty("password"));
		System.out.println("passwordValueIfKeyNotexist: " + password);
		
		
		System.out.println(prop.containsKey("password"));
		System.out.println(prop.containsKey("passwordValue"));
	}

}

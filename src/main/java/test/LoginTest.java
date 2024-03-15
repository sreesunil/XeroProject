package test;

import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseTest {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = BaseTest.getBrowserType("Firefox");
		
		driver.get("https://login.xero.com");
		
		
	}
	
	

}



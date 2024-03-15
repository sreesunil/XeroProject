package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	

	public static   WebDriver getBrowserType(String browserName) {
		
		WebDriver driver;

		String browserType = browserName.toLowerCase();

		driver = new ChromeDriver();

		switch (browserType) {
		case "chrome":
			driver = new ChromeDriver();

			break;

		case "firefox":
			driver = new FirefoxDriver();

			break;

		default:
			driver = null;
			break;
		}
		return driver;

	}

}

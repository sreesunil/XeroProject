package xeroproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC2D {

	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='Responsive__Wrapper-sc-1917um-0 kMJKCM']//span[@class='Button__Backplate-sc-1p1w21k-0 hPBycn'][normalize-space()='Try Xero for free']")).click();
		
		driver.findElement(By.xpath("//span[text()='offer details']")).click();
	}

}

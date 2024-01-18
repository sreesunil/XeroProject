package xeroproject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.xero.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xl-form-email")).sendKeys("qatesting9870@gmail.com");
		driver.findElement(By.id("xl-form-password")).sendKeys("incorrectpswd");
		driver.findElement(By.id("xl-form-submit")).click();
		
		WebElement actualmessage =driver.findElement(By.xpath("//div[@id='xl-validation-message']"));
		System.out.println(actualmessage.getText());
		
	Assert.assertEquals(actualmessage.getText(), "Your email or password is incorrect");
	
	
	}

}

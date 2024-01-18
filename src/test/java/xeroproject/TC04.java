package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04 {

	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.xero.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xl-form-email")).sendKeys("qatesting9870@gmail.com");
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("Email")).sendKeys("qatesting9870@gmail.com");
		driver.findElement(By.id("submit-reset-password")).click();
		WebElement actualmessage = driver.findElement(By.xpath("//div[@class='xui-text-secondary']"));
		System.out.println(actualmessage.getText());
		Assert.assertEquals(actualmessage.getText(), "You should receive an email shortly with instructions on how to reset your password.");
		

	}

}

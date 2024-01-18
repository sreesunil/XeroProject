package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.xero.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xl-form-email")).sendKeys("qatesting9870@gmail.com");
		driver.findElement(By.id("xl-form-password")).sendKeys("asksree550");
		driver.findElement(By.id("xl-form-submit")).click();
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//abbr[@class='xnav-avatar xnav-avatar-color-10']")).click();
		driver.findElement(By.linkText("Log out")).click();
		
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Login | Xero Accounting Software");


	}
	
	
}

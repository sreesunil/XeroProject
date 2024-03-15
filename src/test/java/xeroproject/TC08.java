package xeroproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC08 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.xero.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("xl-form-email")).sendKeys("gopala.anumanchipalli@gmail.com");
		driver.findElement(By.id("xl-form-password")).sendKeys("password12");
		driver.findElement(By.id("xl-form-submit")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='xnav-appbutton--text']")).click();
		System.out.println("Testing");
		driver.findElement(By.linkText("Add a new organisation")).click();
		
		driver.findElement(By.xpath("//*[@data-automationid='organisation-name--input']")).sendKeys("self");
		
		
		
	}

}

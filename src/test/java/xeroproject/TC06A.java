package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC06A {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Edit Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-1041-btnInnerEl")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("filefield-1174-button-fileInputEl")).sendKeys("C:\\\\Users\\\\smann\\\\OneDrive\\\\Desktop\\\\download.jpg");
		driver.findElement(By.id("button-1178-btnInnerEl")).click();
	}
	
//driver.findElement(By.xpath("//span[@class='xnav-verticalmenuitem--subheading']"))
}

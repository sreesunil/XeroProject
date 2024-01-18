package xeroproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC08 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.xero.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xl-form-email")).sendKeys("gopala.anumanchipalli@gmail.com");
		driver.findElement(By.id("xl-form-password")).sendKeys("password12");
		driver.findElement(By.id("xl-form-submit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='xnav-appbutton--text']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add a new organisation")).click();
		Thread.sleep(6000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		
		driver.switchTo().window(childwindow);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='x_Bvd0jDCK']")).sendKeys("Self");

//driver.findElement(By.id("x_Bvd0jDCK"))
		//driver.findElement(By.xpath("//input[@id='x_Bvd0jDCK']"))
	}

}

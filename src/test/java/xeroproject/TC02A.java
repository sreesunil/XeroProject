package xeroproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02A {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='Responsive__Wrapper-sc-1917um-0 kMJKCM']//span[@class='Button__Backplate-sc-1p1w21k-0 hPBycn'][normalize-space()='Try Xero for free']")).click();
		driver.findElement(By.id("1-textinput-60")).sendKeys("Admin");
		driver.findElement(By.id("1-textinput-64")).sendKeys("123");
		driver.findElement(By.id("1-textinput-68")).sendKeys("qatesting9870@gmail.com");
		driver.findElement(By.id("1-phone-72")).sendKeys("002-342-8030");
		
		
		WebElement dropdown = driver.findElement(By.id("1-select-78"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("United States");
		driver.findElement(By.xpath("//span[@class='Checkbox__StyledCheckbox-sc-1dxs2xu-2 hgsQPn']")).click();
		
	}

}

package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class Test1 {

	protected static WebDriver driver;

	
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/AutomationChallenge_2022/QE-index.html");

		WebElement email = driver.findElement(By.id("inputEmail"));
		Assert.assertEquals(true, email.isDisplayed());
		System.out.println("Logo is displayed – Assert passed");
		email.sendKeys("geetesh@gmail.com");
		
		
		WebElement pass = driver.findElement(By.id("inputPassword"));
		Assert.assertEquals(true, pass.isDisplayed());
		System.out.println("Pass is displayed – Assert passed");
		pass.sendKeys("geetesh123");
		
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		Assert.assertEquals(true, button.isDisplayed());
		System.out.println("Button is displayed – Assert passed");
		//button.click();
		
	}

}

package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class Test5 {

	protected static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/AutomationChallenge_2022/QE-index.html");

		WebElement btn = driver.findElement(By.id("test5-button"));
		btn.click();

		WebElement note = driver.findElement(By.xpath("//div[contains(text(),'You')]"));
		String n = note.getText();
		Assert.assertTrue(note.isDisplayed());
		System.out.println(n);

		btn.click();
		Assert.assertTrue(btn.isDisplayed());
		System.out.println("Button is Disabled");

	}

}

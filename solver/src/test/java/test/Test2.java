package test;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class Test2 {
	protected static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/AutomationChallenge_2022/QE-index.html");

		String b = driver.findElement(By.xpath("//ul[@class='list-group']")).getText();
		System.out.println(b);
		
		String Item = driver.findElement(By.xpath("//li[contains(text(),' List Item 2')]")).getText();
		Assert.assertEquals("List Item 2 6", Item);
		System.out.println("Value is present:" + Item);

		String badge = driver.findElement(By.xpath("//div[@id='test-2-div']//following::span[contains(text(),'6')]")).getText();
		Assert.assertEquals("6", badge);
		System.out.println("Value is present:" + badge);

	}

}

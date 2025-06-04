package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class Test3 {

	protected static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/AutomationChallenge_2022/QE-index.html");

		WebElement a = driver.findElement(By.xpath("//button[contains(text(),' O')]"));
		String drop = a.getText();
		Assert.assertEquals("Option 1", drop);
		System.out.println(drop);
		a.click();

		driver.findElement(By.xpath("(//div[@class='dropdown-menu show']//following-sibling::a)[3]")).click();

	}

}

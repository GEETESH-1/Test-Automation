package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 {

	protected static WebDriver driver;

	public static void click(WebElement wb) {
		if ((wb.isDisplayed()) && (wb.isEnabled())) {
			System.out.println("Button is Enable");
			wb.click();
		} else {
			System.out.println("Button is Disabled");
		}
	}

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/AutomationChallenge_2022/QE-index.html");

		WebElement Ebotton = driver.findElement(
				By.xpath("//div[@id='test-4-div']//following-sibling::button[@class='btn btn-lg btn-primary']"));
		WebElement Dbotton = driver.findElement(
				By.xpath("//div[@id='test-4-div']//following-sibling::button[@class='btn btn-lg btn-secondary']"));

		Test4.click(Ebotton);
		Test4.click(Dbotton);

	}

}

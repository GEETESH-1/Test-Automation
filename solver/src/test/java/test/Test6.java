package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class Test6 {

	protected static WebDriver driver;

	public static String value(String value) {
		String path = "//tr//td[contains(text(),'" + value + "')]";
		return path;
	}

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/AutomationChallenge_2022/QE-index.html");

		List<WebElement> rowsNumber = driver.findElements(By.xpath("//th"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);

		List<WebElement> columnsNumber = driver.findElements(By.xpath("//tr"));
		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);

		String x = Test6.value("Brietta");

		String w = driver.findElement(By.xpath(x)).getText();
		System.out.println(w);

		for (int i = 1; i <= 2; i++) {

			for (int j = 1; j <= 2; j++) {

				if (i == 2 && j == 2) {
					String t = driver.findElement(By.xpath("//tr[" + i + "]//td[" + j + "]")).getText();

					System.out.println(t);
				}
			}

		}

		WebElement cellAddress = driver.findElement(By.xpath("//td[contains(text(),'Ventosanzap')]"));

		String value = cellAddress.getText();

		Assert.assertEquals("Ventosanzap", value);

		System.out.println("The Cell Value is : " + value);

	}

}

package MultipleWaysToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idXPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");

		WebDriver driver;
		driver = new ChromeDriver();
		String baseURL="https://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.findElement(By.id("lst-ib")).sendKeys("selenium hq");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
	}

}

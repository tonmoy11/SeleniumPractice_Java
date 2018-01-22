package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FindingElementByName {

	public static void main(String[] args) {		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/geckodriver");

		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		driver.findElement(By.name("lst-ib")).sendKeys("letskodeit");

		//driver.findElement(By.xpath(".//*[@id='_fZl']")).click();
		
		driver.findElement(By.name("btnG")).click();
		
		//
		//lst-ib  gsfi  .//*[@id='_fZl']
		//driver.close();
		
	}

}

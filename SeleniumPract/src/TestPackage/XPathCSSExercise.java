package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCSSExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
		driver = new ChromeDriver();
		
		String baseURL= "https://letskodeit.teachable.com/p/practice";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//table[@id='product']//td[text()='Python Programming Language']//following-sibling::td")).click();
		
		
	}

}

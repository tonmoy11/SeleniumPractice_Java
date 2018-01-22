package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

	public static void main(String[] args) {		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/geckodriver");
		driver = new ChromeDriver();
		
		String baseURL = "http://www.google.com";
		driver.get(baseURL);
		
	}

}

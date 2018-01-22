package TestDemo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class FirstTest {

	public static void main(String[] args) {		
		
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.twitter.com";
		driver.get(baseURL);
		
		//driver.close();
		
	}

}

package tutorialSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverDemo1 {

	public static void main(String[] args) {		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/geckodriver");
		driver = new FirefoxDriver();
		
		String baseURL = "http://www.google.com";
		driver.get(baseURL);
		
	}

}

package tutorialSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");

		WebDriver driver;
		driver = new ChromeDriver();
		String baseURL = "http://www.facebook.com";
		driver.get(baseURL);
		
		
	}

}

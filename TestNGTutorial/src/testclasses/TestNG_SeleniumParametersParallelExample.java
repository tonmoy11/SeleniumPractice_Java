package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestNG_SeleniumParametersParallelExample {
	WebDriver driver;
	String baseUrl;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser) {
		baseUrl = "https://letskodeit.teachable.com";
		
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/geckodriver");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
			driver = new ChromeDriver();
		}
		//go to web
		driver.get(baseUrl);
		
		//manage window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void testLetskode_logIn() throws InterruptedException {
		
		//Click login button
		WebElement clickLogin = driver.findElement(By.linkText("Login"));
		clickLogin.click();
		
		//Go to email field
		WebElement emailField = driver.findElement(By.id("user_email"));
		emailField.sendKeys("acd@email.com");
		
		//Go to password field
		WebElement passField = driver.findElement(By.id("user_password"));
		passField.sendKeys("dwer");
		
		//Click lgin
		WebElement loginBtn = driver.findElement(By.name("commit"));
		loginBtn.click();
		
		Thread.sleep(10);
		
	}

	@AfterClass
	public void cleanUp() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}

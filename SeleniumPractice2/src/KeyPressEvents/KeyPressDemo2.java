package KeyPressEvents;


import static org.junit.Assert.*;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;
//import javax.security.auth.x500.X500PrivateCredential;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.RunListener.ThreadSafe;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	
public class KeyPressDemo2 {
	
	private WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		//js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
		action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}

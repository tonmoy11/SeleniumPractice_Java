package SwitchWindowAnd_Iframes;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {
	private WebDriver driver;
	private JavascriptExecutor js;
	String baseUrl;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		//js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		//Switch to frame by Id
		driver.switchTo().frame("courses-iframe");
		//Switch to frame by name
		//driver.switchTo().frame("iframe-name");
		System.out.println("1");
		
		//Switch to framework by numbers
		//driver.switchTo().frame(0);
		
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("python");
		System.out.println("2");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Test Successful");
		System.out.println("3");
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	
}

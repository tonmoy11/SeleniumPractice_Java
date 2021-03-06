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

public class ScrollingElementIntoView {
	private WebDriver driver;
	String baseUrl;
	private JavascriptExecutor js;
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void CheckifTheBrowserScrollsasPerTest() throws Exception {
		//Navigation
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
		Thread.sleep(3000);
		System.out.println("1");
		
		//Scroll Down
		js.executeScript("window.scrollBy(0,1900);");
		System.out.println("2");
		//Scroll Up
		js.executeScript("window.scrollBy(0,-1700);");
		Thread.sleep(3000);
		System.out.println("3");
		//Scroll element to view
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		System.out.println("4");
		js.executeScript("window.scrollBy(0,-190);");
		System.out.println("4 and its the end of test");
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	
}

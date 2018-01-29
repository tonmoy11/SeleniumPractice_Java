package WorkingWithActionClass;

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
import org.openqa.selenium.interactions.Actions;

	
public class MouseHoverActions {
	
	private WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;
	
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
		driver.get(baseUrl);
		js.executeScript("window.scrollBy(0, 600");
		Thread.sleep(3000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		
		WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text='Top'"));
		action.moveToElement(subElement).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}

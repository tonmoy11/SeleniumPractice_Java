package WorkingWithActionClass;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
//import javax.security.auth.x500.X500PrivateCredential;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	
public class SliderAction {
	
	private WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://jqueryui.com/slider/";
		//js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		//Using Action class
		WebElement elementSlider = driver.findElement(By.xpath("//div[@id ='slider']/span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(elementSlider, 100, 0).perform();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}

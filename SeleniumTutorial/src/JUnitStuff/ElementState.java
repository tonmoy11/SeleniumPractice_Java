package JUnitStuff;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class ElementState {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
		driver= new ChromeDriver();
		baseURL ="https://www.google.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);

	}
	
	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.id("gs_htif0"));
		System.out.println("Is E1 is enabled: " + e1.isEnabled());
	
		WebElement e2 = driver.findElement(By.id("lst-ib"));
		System.out.println("Is E2 is enabled: " + e2.isEnabled());

		
		WebElement e3 = driver.findElement(By.id("gs_taif0"));
		System.out.println("Is E3 is enabled: " + e3.isEnabled());
		
		e2.sendKeys("letskodeit");



	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	
}

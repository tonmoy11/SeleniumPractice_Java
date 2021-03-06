package AutomationFramework;


import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
//import javax.security.auth.x500.X500PrivateCredential;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	
public class PageObjectModel {
	
	private WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		//js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		SearchPage.flighttab(driver);
		System.out.println("1");
		SearchPage.fillOriginTextBox(driver, "New York");
		System.out.println("2");
		SearchPage.destinationTextBox(driver).sendKeys("chicago");
		System.out.println("3");
		SearchPage.departureDateTextBox(driver).sendKeys("01/30/2017");
		System.out.println("4");
		SearchPage.returnDateTextBox(driver).clear();
		System.out.println("5");
		SearchPage.returnDateTextBox(driver).sendKeys("01/31/2017");
		System.out.println("6");
		SearchPage.clickOnSearchButton(driver);
		System.out.println("7");

		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}

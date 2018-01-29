package SwitchWindowAnd_Iframes;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {
	private WebDriver driver;
	private String baseUrl;
	
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
	public void JScriptalert1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Boso");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@Test
	public void JScriptalert2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Boso");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	@After
	public void tearDown() throws Exception {
	}

}

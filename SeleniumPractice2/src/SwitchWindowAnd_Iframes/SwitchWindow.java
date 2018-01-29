package SwitchWindowAnd_Iframes;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	private WebDriver driver;
	private JavascriptExecutor js;
	String baseUrl, baseUrl2;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		baseUrl2 = "https://www.retailmenot.com/";
		//js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		//WebElement searchBox = driver.findElement(By.id("search-courses"));
		//searchBox.sendKeys("python");
			//Get the handle 
		String parentHandle = driver.getWindowHandle();
		System.out.println("Print Handle: " + parentHandle);
		
		//Find open WindowHandle
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		//Get all handles
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle : handles){
			System.out.println(handle);
			if(!handle.equals(parentHandle)){
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				Thread.sleep(1000);
				driver.close();
				break;
			}
		}
		//switch back to parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Test Successful");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}

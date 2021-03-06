package SelWeb_Advanced;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.dsig.CanonicalizationMethod;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelection {
	
	WebDriver driver;
	String baseurl; 
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseurl = "https://www.expedia.com/";
		// Maximize the browser's window

		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}

	@Test
	public void test1() {
		driver.get(baseurl);
		//click flight tab
		driver.findElement(By.id("tab-flight-tab-hp")).click(); 
		WebElement departingField = driver.findElement(By.id("flight-departing-hp-flight"));
		//click departing field
		departingField.click();
		System.out.println("TEST COMPLETED 1");
	
	}
	

	@Test
	public void test2() throws Exception {
		driver.get(baseurl);
		//click flight tab
		driver.findElement(By.id("tab-flight-tab-hp")).click(); 
		System.out.println("task 1 completed");
		WebElement departingField = driver.findElement(By.id("flight-departing-hp-flight"));
		//click departing field
		departingField.click();
		
		WebElement calMonth =driver.findElement(By.id("flight-departing-hp-flight"));
		
		//learn this code
		List <WebElement> allValidDates = calMonth.findElements(By.tagName("a"));
		
		Thread.sleep(3000);
		
		for(WebElement date : allValidDates){
			if(date.getText().equals("31")){
				date.click();
			}
	
		}
		System.out.println("TEST COMPLETED 2");

	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	

}

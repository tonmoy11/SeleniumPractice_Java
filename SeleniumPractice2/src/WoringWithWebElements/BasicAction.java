package WoringWithWebElements;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAction {

	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
	String baseURL; 
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
		driver =new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() {
	driver.get(baseURL);
	driver.findElement(By.xpath("//div[@id='navbar']//a[@class='navbar-link fedora-navbar-link']")).click();
	System.out.println("Passed login click");
	driver.findElement(By.id("user_email")).clear();
	driver.findElement(By.id("user_email")).sendKeys("toko@gmal.com");
	System.out.println("Passed email input");
	driver.findElement(By.id("user_password")).sendKeys("abc");
	System.out.println("Passed password input");	
	driver.findElement(By.id("user_email")).sendKeys("toko@gmal.com");
	System.out.println("cleared email input");
	driver.findElement(By.id("user_password")).sendKeys("abc");
	System.out.println("cleared password input");


	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}

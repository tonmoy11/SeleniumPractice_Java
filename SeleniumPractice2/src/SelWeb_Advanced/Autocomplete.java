package SelWeb_Advanced;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");

		driver = new ChromeDriver();
		baseUrl = "https://www.southwest.com/";

		// Maximize the browser's window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test// Autocomplete is a suggest in auto search
	
	public void test() throws Exception{
		driver.get(baseUrl);
		String searchingText = "Newark, NJ - EWR";
		String partialText = "New York";
		
		WebElement text =driver.findElement(By.id("air-city-departure"));
		text.sendKeys(partialText);
		
		WebElement element = driver.findElement(By.id("air-city-departure-menu"));
		List <WebElement> results = element.findElements(By.tagName("li"));
		int size = results.size();
		
		System.out.println("The size of the list is " + size);
		
		for (int i =0; i<size; i++){
			System.out.println(results.get(i).getText());
		}
		
		Thread.sleep(1000);
		
		for (WebElement result :results){
			if(result.getText().equals(searchingText)){
				result.click();
				System.out.println("Selected: " +result.getText());
				break;
			}
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}

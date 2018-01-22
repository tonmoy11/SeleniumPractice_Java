package workingWithElements;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckboxes {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}

	@Test
	public void test() throws Exception {
		WebElement bmwRadiobtn =driver.findElement(By.id("bmwradio"));
		bmwRadiobtn.click();
		
		WebElement benzRadiobtn =driver.findElement(By.id("benzradio"));
		benzRadiobtn.click();
		
		WebElement bmwCheckbox=driver.findElement(By.id("bmwcheck"));
		bmwCheckbox.click();
		
		WebElement hondaCheckbox =driver.findElement(By.id("hondacheck"));
		hondaCheckbox.click();
		
		
		System.out.println("BMW radio is selected?  "+ bmwRadiobtn.isSelected());	
		System.out.println("Benz radio is selected?  "+ benzRadiobtn.isSelected());	
		System.out.println("BMW Checkbox is selected?  "+ bmwRadiobtn.isSelected());	
		System.out.println("Honda Checkbox is selected?  "+ bmwRadiobtn.isSelected());	

		
		Thread.sleep(3000);

	
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}

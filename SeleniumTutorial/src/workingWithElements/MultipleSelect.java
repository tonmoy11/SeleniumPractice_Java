package workingWithElements;

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
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	WebDriver driver;
	String baseURL;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		//Maximize browser and wait time 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test
	public void testMultiSelect() throws InterruptedException {
		
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);

		Thread.sleep(2000);
		System.out.println("Select Orange by Value");
		sel.selectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("De-Select Orange by Value");
		sel.deselectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("Select Peach by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select Apple by visible text");
		sel.selectByVisibleText("Apple");
		
		Thread.sleep(2000);
		System.out.println("Print all selected options");
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		for(WebElement option : selectedOptions){
			System.out.println(option.getText());
		}
		
		Thread.sleep(2000);
		System.out.println("De-select all selected options");
		
		
		
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	
}

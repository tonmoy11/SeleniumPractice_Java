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

public class DropdownSelect {
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
	public void testDropdown() throws InterruptedException {
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Select Benz by value ");
		
		Thread.sleep(2000);
		System.out.println("Select Honda by index ");
		
		Thread.sleep(2000);
		System.out.println("Select BMW by visible text ");
		
		Thread.sleep(2000);
		System.out.println("Print the list of all options");
		List<WebElement> options =sel.getOptions();
		int size =options.size();
		
		for (int i=0; i<size; i++){
			String optionName = options.get(i).getText();
			System.out.println(optionName);
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	
	}

	

}

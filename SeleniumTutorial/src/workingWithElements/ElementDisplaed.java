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

public class ElementDisplaed {
	WebDriver driver;
	String baseURL1, baseURL2;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
		driver = new ChromeDriver();
		baseURL1 = "https://letskodeit.teachable.com/p/practice";
		baseURL2 = "http://www.expedia.com";
		//Maximize browser and wait time 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	/*@Test
	public void testLetsKodeIt() throws InterruptedException {
		driver.get(baseURL1);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text box is displayed by default: "+ textBox.isDisplayed());
		
		Thread.sleep(2000);
		
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		hideBtn.click();
		System.out.println("Clicked on hide button");
		System.out.println("Text box is displayed by default: "+ textBox.isDisplayed());
		
		Thread.sleep(2000);
		
		WebElement showBtn = driver.findElement(By.id("show-textbox"));
		showBtn.click();
		System.out.println("Clicked on hide button");
		System.out.println("Text box is displayed by defult: "+ textBox.isDisplayed());
		
		

	}*/
	
	@Test
	public void testExpedia() {
		driver.get(baseURL2);
		
		WebElement childDropdown = driver.findElement(By.xpath(".//*[@id='tab-package-tab-hp']"));
		System.out.println("Childropdown displayed:: " + childDropdown.isDisplayed());
		Select sel = new Select(childDropdown);
		//boolean isPresent = false;
		System.out.println("Select number 2 BY VALUE"+ childDropdown.isDisplayed());
		sel.selectByValue("2");
		
		/*List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		for(WebElement option : selectedOptions){
			System.out.println(option.getText());
		}*/

	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}

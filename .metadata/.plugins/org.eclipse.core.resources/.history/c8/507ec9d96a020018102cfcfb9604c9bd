package UsefulMethodsAndProperties_SelWeb;

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

import UsefulMethodsAndProperties_SelWeb.GenericMethods;


public class GenericMethodsDemo {
	private WebDriver driver;
	private String baseURL;
	private GenericMethods gm;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseURL = "http://letskodeit.teachable.com/p/practice"
				+ "";
		gm = new GenericMethods(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
	}

	@Test
	public void test() {
		driver.get(baseURL);
		//to retrieve single element you type consctructor as below
		//WebElement element = gm.getElement("id", "xpath");
		List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
		int size = elementList.size();
		System.out.println("Size of the element list is: " + size);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		
	}

	

}

package JUnitStuff;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBetweenPages {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() throws Exception {
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println("Title of the web page is   "+ title);
		
		String CurrentUrRL =driver.getCurrentUrl();
		System.out.println("Current URL is  "+ CurrentUrRL);
		
		String urlToNavgt= "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavgt);
		System.out.println("Navigate to Login");
		
		CurrentUrRL =driver.getCurrentUrl();
		System.out.println("Current URL is  "+ CurrentUrRL);

		Thread.sleep(4000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		CurrentUrRL=driver.getCurrentUrl();
		System.out.println("Current URL is  "+ CurrentUrRL);

		
		Thread.sleep(4000);
		driver.navigate().forward();
		System.out.println("Navigate forwar");
		CurrentUrRL=driver.getCurrentUrl();
		System.out.println("Current URL is  "+ CurrentUrRL);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		CurrentUrRL=driver.getCurrentUrl();
		System.out.println("Current URL is  "+ CurrentUrRL);
		
		driver.navigate().refresh();
		System.out.println("refreshh the page");
		driver.get(CurrentUrRL);
		driver.navigate().refresh();
		System.out.println("refreshh the page");
		
		String pageSource =driver.getPageSource();
		System.out.println("Page source is      " + pageSource);
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}

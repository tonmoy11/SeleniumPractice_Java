package WaitTypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilitytypes.WaitTypes;
import utilitytypes.WaitTypes2;


public class ExplicitWaitWithUtilityDemo2 {
	private WebDriver driver;
	private String baseUrl;
	WaitTypes2 wt;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");

		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		wt = new WaitTypes2(driver);  //always instnaciate after you call the driver

		// Maximize the browser's window
		driver.manage().window().fullscreen();
	}
	
	@Test()
	public void test() throws Exception {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
///		WebDriverWait wait = new WebDriverWait(driver, 10); //time depends on how much I put the time
//		WebElement emailField = wait.until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='user_email']")));
//		emailField.sendKeys("test");
		WebElement emailField = wt.waitforElement(By.id("user_email"),3);
		emailField.sendKeys("test");
		
		wt.clickWhenReady(By.name("commit"),3);
		//driver.findElement(By.id("user_email")).sendKeys("test");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}

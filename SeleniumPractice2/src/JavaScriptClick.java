import static org.junit.Assert.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClick {
	private WebDriver driver;
	private JavascriptExecutor js;
	String baseUrl, baseUrl2;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		baseUrl2 = "https://www.retailmenot.com/";
		js = (JavascriptExecutor) driver;
		
		// Maximize the browser's window
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	@Test
//	public void testJsClick1() {
//		driver.get(baseUrl);
//		WebElement elementcheckBox = driver.findElement(By.id("bmwcheck"));
//		//only to be performend when java executor fails
//		js.executeScript("arguments[0].click", elementcheckBox);
//		System.out.println("1");
//		
//	}
	
	@Test
	public void testJsClick2() throws Exception {
		driver.get(baseUrl2);
		driver.findElement(By.cssSelector(".js-user-bar")).click();;
		System.out.println("2");
		Thread.sleep(300);
		//only to be performend when java executor fails
		WebElement checkBoxelement = driver.findElement(By.id("subscribe"));
		System.out.println("3");
		System.out.println("Displayed: " + checkBoxelement.isDisplayed());
		System.out.println("Selected: " + checkBoxelement.isSelected());
		
		//checkBoxElement.click();
		js.executeScript("arguments[0].click", checkBoxelement);
		
		
	}
//	private String getRandomString(int i) {
//		StringBuilder sb = new StringBuilder();
//		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//		int length = 0;
//		for (int i1 = 0; i1 < length; i1++) {
//			int index = (int) (Math.random() * characters.length());
//			sb.append(characters.charAt(index));		
//			return null;
//		}
//		return characters;
//	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
//		String fileName = getRandomString(10) + ".png";
//		String directory = "//Users//anil.tomar//Desktop//";
//		
//		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		driver.quit();
	}

	

	

}

package MultipleWaysToLocateElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseURL = "http://demostore.x-cart.com/";
		driver.manage().window().maximize();
		driver.findElement(By.tagName("a")).click();
		
		//id
		
		
		
	}

}

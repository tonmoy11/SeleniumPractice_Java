package MultipleWaysToLocateElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByLinkText {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String baseURL = "https://letskodeit.teachable.com";
	System.out.println("check 1");
	driver.get(baseURL);
	
	driver.findElement(By.linkText("Login")).click();
	System.out.println("check 2");

	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Prac")).click();
	System.out.println("check 3");

	driver.quit();
	System.out.println("check 5");

	
	}

}

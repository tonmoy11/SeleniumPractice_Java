package MultipleWaysToLocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameDemo {
	//FInd Elements using name
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");	
	WebDriver driver = new ChromeDriver();
	String baseURL="https://www.google.com/search?q=letskodeit&oq=letskode&aqs=chrome.0.69i59j69i57.5214j0j9&sourceid=chrome&ie=UTF-8";
	driver.manage().window().maximize();
	driver.get(baseURL);
	
	driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
	System.out.println("sent keys");
	driver.findElement(By.name("btnG")).click();
	System.out.println("clicked");
	
	}

}

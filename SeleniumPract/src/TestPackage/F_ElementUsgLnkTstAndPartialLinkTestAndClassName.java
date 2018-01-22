package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class F_ElementUsgLnkTstAndPartialLinkTestAndClassName {
	public static void main(String[] args) throws Exception{		
	
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
			driver = new ChromeDriver();
			
			String baseURL= "https:demostore.x-cart.com";
			
			//get websitex`
			driver.get(baseURL);
			driver.manage().window().maximize();
			
			//link text
			driver.findElement(By.linkText("New!")).click();
			Thread.sleep(4000);
			//find by partial link text
			driver.findElement(By.partialLinkText("Contact")).click();
			
			driver.findElement(By.className("leaf")).click();
			//anchor tag
			driver.findElement(By.tagName("a")).click();
			driver.close();
			//driver.close();

			//id, classname, tag, linktext, partial link text, xpath, name, css selector
	}
	
}

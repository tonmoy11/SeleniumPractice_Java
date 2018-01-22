package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsgCSSSeletrs2FindElmnts {
	public static void main(String[] args){
		
	WebDriver driver;	
	System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/chromedriver");
	driver = new ChromeDriver();
	
	String baseUrl= "https://letskodeit.teachable.com/";
	driver.get(baseUrl);
	//unique xpath and 
	driver.findElement(By.xpath("//div[@class='homepage-hero']//a"));
	//unique value with text
	driver.findElement(By.xpath("//div[@class='homepage-hero']//a[text()='Enroll now']"));
	//when there are much spaces in text
	driver.findElement(By.xpath(" .//div[@id='navbar']//a[contains(text(),'Login')]"));
	//another example with contains
	driver.findElement(By.xpath("//div[@id='navbar']//a[contains(@class,'fedora-navbar-link') and contains(@href,'/pages/practice')]"));
	//startswith keyword in xpath
	driver.findElement(By.xpath("//div[@id='navbar']//a[starts-with(@class,'fedora-navbar-link navbar-link') and contains(@href,'practice')]"));



	

		
	
	}
	
}

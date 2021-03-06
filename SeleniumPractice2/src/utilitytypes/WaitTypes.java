package utilitytypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	
	WebDriver driver;
	
	public WaitTypes(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement waitforElement(By locator, int timeout){
		WebElement element = null;
		try{
			System.out.println("Waiting for max: " + timeout + "seconds for element to be available");
			WebDriverWait wait = new WebDriverWait(driver, 10); //time depends on how much I put the time
			WebElement emailField = wait.until(
					ExpectedConditions.visibilityOfElementLocated(locator));
			emailField.sendKeys("test");
			
		}catch(Exception e){
			System.out.println("Element not appeared on the web page.");
		}
		return element;
	}

}

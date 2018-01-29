package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement element = null;
	/*
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		return element;
		}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys("orig");
		//return element;
		}
	
	public static void flighttab (WebDriver driver){
		element = driver.findElement(By.id("tab-flight-tab-hp"));
		element.click();
		
	}
	
	
	/*
	 * Returns the flight destination textbox element
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-destination"));
		element.click();
		return element;
	}
	
	/*
	 * Returns the departure date text box element
	 * @param
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	
	/*
	 * Returns the return date text box element
	 * @param
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	/*
	 * Returns the search button box element
	 * @param
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver){
		element = driver.findElement(By.id("search-button"));
		return element;
	}
	
	/*
	 * Click on Search button
	 * @param
	 */
	public static void clickOnSearchButton(WebDriver driver){
		element = searchButton(driver);
		element.click();
	}
	
	/*
	 * Navigate to flight tab
	 * @param driver
	 */
	public static void navigateToflightTab (WebDriver driver){
		driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
	
	}

	

}

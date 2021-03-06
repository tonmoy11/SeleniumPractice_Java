package UsefulMethodsAndProperties_SelWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {
	WebDriver driver;
	
	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	//change Webelement to List<WebElement>if you want list or
	//else keep it to WebElement to retrieve on element
	//and mind to change findElement to findElements
	
	//public WebElement getElement (String locator, String type) 
	public List<WebElement> getElementList (String locator, String type){
		type = type.toLowerCase();
		if (type.equals("id")){
		System.out.println("Element found with id: " + type);
		return this.driver.findElements(By.id(locator));
			
		}
		else if (type.equals("xpath")){
			System.out.println("Element found with xpath: " + type);
			return this.driver.findElements(By.xpath(locator));
		}
		else{
			System.out.println("Locator type not supported!");
			return null;
		}
	}

}

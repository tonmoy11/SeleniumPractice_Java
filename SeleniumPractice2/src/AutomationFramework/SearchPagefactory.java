package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPagefactory {
	WebDriver driver;
	
	
	@FindBy(id = "tab-flight-tab-hp")
	WebElement flighttab;
	
	@FindBy (id = "flight-type-roundtrip-label-hp-flight")
	WebElement roundtrip;
	
	@FindBy (id = "flight-type-multi-dest-label-hp-flight")
	WebElement multiCity;
	
	@FindBy (id = "flight-origin-hp-flight")
	WebElement flyFrom;
	
	@FindBy (id = "flight-destination-hp-flight")
	WebElement FlyTo;
	
	@FindBy (id = "flight=departing-hp-flight")
	WebElement departDate;
	
	@FindBy (id = "flight-returning-hp-flight")
	WebElement returnDate;
	
	//need a understand to create method
	public SearchPagefactory(WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickFlightTab(){
		flighttab.click();
	}
	
	
	public void clickRoundTrip(){
		roundtrip.click();
	}
	
	public void sendFlyFrom(String origin){
		flyFrom.sendKeys(origin);
	}
	
	public void sendflyTo(String destination ){
		FlyTo.sendKeys(destination);
	}
	
	public void sendDepartDate(String dateX){
		departDate.sendKeys(dateX);
	}
	
	public void sendReturnDate(){
		returnDate.sendKeys("04/12/2018");
	}
	public void clickMultiCity(){
		multiCity.click();
	}
	
	
}

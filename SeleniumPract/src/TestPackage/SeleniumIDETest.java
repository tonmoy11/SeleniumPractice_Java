package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;	

public class SeleniumIDETest {
	
  private WebDriver driver;
  private String baseUrl;
  
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.letskodeit.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  
  	}

}


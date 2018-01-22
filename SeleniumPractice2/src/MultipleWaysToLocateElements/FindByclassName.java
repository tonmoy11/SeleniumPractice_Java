package MultipleWaysToLocateElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByclassName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/tonmoyiskander/Desktop/SeleniumWorkSpace/SeleniumJarFiles/Driver Files/chromedriver");	
		WebDriver tomar = new ChromeDriver();
		tomar.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseURL = "http://demostore.x-cart.com/";
		String baseURL2 = "https://letskodeit.teachable.com/p/practice";
		tomar.manage().window().maximize();
		
		tomar.get(baseURL2);
		System.out.println("step 1");
		Thread.sleep(3000);

		tomar.findElement(By.xpath("//div[@class='small course-price']")). click();
		//tomar.findElement(By.className("title")).click();
		System.out.println("step 2");
				tomar.quit();

				
	}

}

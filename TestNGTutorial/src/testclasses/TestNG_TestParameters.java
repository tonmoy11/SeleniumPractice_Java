package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestNG_TestParameters {

	@BeforeClass
	@Parameters ({"browser", "platform"})
	public void beforeClass(String browser, String platform) {
		System.out.println("TestNG_TestParameters -> SetUp");
		System.out.println("1. Parameter value from xml file: " + browser);
		System.out.println("2. Parameter value from xml file: " + platform);
	}

	@Test
	@Parameters({"response"})
	public void testMethod(String response) {
		String [] stringArray = response.split(",");
		System.out.println("TestNG_TestParameters -> testMethod1");
		System.out.println("Response from xml file: " + response);
	
	}

}

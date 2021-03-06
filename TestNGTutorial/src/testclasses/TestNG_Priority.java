package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Priority {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nTestNG_TestClass1 -> before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_TestClass1 -> after class");
	}
	//0 is the highest priority and rest as follows
	
	@Test(priority = 2)
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test(priority = 1)
	public void testMethod2() {
		System.out.println("testMethod2");
	}
	
	@Test(priority = 0)
	public void testMethod3() {
		System.out.println("testMethod3"
				+ "");
	}
}
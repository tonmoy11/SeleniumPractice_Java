package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTestSuite {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("BaseTestSuite -> before class");		
	}
	
	@AfterClass
	public void afterclass(){
		System.out.println("BaseTestSuite -> after class");		

	}

	@BeforeTest
	public void beforeTest(){
		System.out.println("BaseTestSuite -> before class");		
	}
	
	@AfterTest
	public void afterTet(){
		System.out.println("BaseTestSuite -> after class");		

	}

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("\nBaseTestSuite -> before suite");		

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nBaseTestSuite -> after suite");		

	}

}

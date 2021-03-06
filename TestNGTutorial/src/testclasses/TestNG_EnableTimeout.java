package testclasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_EnableTimeout {
//and instance or a scenerio where you found a bug and need to disable a testcase
	SomeClassToTest obj;
	
	@BeforeClass
	public void beforeClass() {
		
		obj = new SomeClassToTest(); // now you can call class in every method
		System.out.println("Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");

	}

	@Test (enabled = true)
	public void testmethod1() {
		System.out.println("Running test1 ");
		
	}

	@Test(timeOut = 100) //increase or similar timeout will case to pass the test
	public void testmethod2() throws InterruptedException {
		System.out.println("Running test2");
		Thread.sleep(200);
		
	}


}

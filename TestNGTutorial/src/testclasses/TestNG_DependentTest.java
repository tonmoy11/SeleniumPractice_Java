package testclasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_DependentTest {

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

	@Test (dependsOnMethods = {"testmethod2"}, alwaysRun=true)
	public void testmethod1() {
		System.out.println("Running test1 ");
		
	}

	@Test
	public void testmethod2() {
		System.out.println("Running test2");
		int result = obj.SumNumbers(0, 2); //correct this and see the output result
		Assert.assertEquals(result, 3);
	}

	@Test (dependsOnMethods= {"testmethod1"})
	public void testmethod3() {
		System.out.println("Running test3");
	}

	@Test//(dependsOnMethods= "testmethod2")
	public void testsmethod4() {
		System.out.println("Running test4");
	}

}

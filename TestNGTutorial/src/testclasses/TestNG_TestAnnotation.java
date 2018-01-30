package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_TestAnnotation {
	@Test // it tells it is a TestNg annotation and part of
	public void testmethod1() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.SumNumbers(1, 2);
		System.out.println("Running test => testMethod1");
	}
	
	@Test // it tells it is a TestNg annotation and part of
	public void testmethod2() {
		System.out.println("Running test => testMethod2");
	}
	
	@Test // it tells it is a TestNg annotation and part of
	public void testmethod3() {
		System.out.println("Running test => testMethod3");
	}

}


package testclasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_Preserve1 {
//

	@Test (enabled = true)
	public void testmethod1() {
		System.out.println("TestNG_Preserve1 -> testmethod1 ");
		
	}

	@Test
	public void testmethod2() {
		System.out.println("TestNG_Preserve1 -> testmethod1");		
	}


}

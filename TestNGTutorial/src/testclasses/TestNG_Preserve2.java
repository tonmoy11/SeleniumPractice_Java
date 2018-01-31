package testclasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_Preserve2 {
//
	
	@Test 
	public void testmethod1() {
		System.out.println("TestNG_Preserve2 -> testmethod2 ");
		
	}

	@Test
	public void testmethod2() {
		System.out.println("TestNG_Preserve2 -> testmethod2");

	}


}

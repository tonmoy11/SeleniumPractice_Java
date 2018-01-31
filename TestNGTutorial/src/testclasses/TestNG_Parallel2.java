package testclasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_Parallel2 {
//

	@Test 
	public void testmethod1() throws InterruptedException {
		System.out.println("TestNG_Parallel2 -> testmethod1");
		Thread.sleep(4000);
		System.out.println("TestNG_Parallel2 -> testmethod1 -> More Steps");
		
	}

	@Test
	public void testmethod2() throws InterruptedException {
		System.out.println("Test_Parallel3 -> testmethod2");	
		Thread.sleep(4000);
		System.out.println("Test_Parallel3 -> testmethod2 -> More Steps");
	}


}

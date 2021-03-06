package testclasses;

import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_SoftAssert {
  @Test
  public void testSum() {
	  SoftAssert sa = new SoftAssert();
	  System.out.println("Running Test -> testSum");
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.SumNumbers(1, 3);

	  sa.assertEquals(result, 4);
	  System.out.println("\nLine after assert 1");
	  
	  sa.assertEquals(result, 3);
	  System.out.println("\nLine after assert 2");

	  sa.assertAll();
  }

//  @Test
//  public void testStrings() {
//	  System.out.println("Running Test -> testStrings");
//	  String expectedString = "Hello World";
//	  SomeClassToTest ibj = new SomeClassToTest();
//	  String result = ibj.addStrings("Hello ", "World");
//	  Assert.assertEquals(result, expectedString);
//  }
//
//  @Test
//  public void testArrays() {
//  System.out.println("Running Test => testarrays");
//  int [] expectedArrays = {1, 2, 3, 4};
//  SomeClassToTest kbj = new SomeClassToTest();
//  int [] result = kbj.getArray();
//  Assert .assertEquals(result , expectedArrays);
//  System.out.println("\nEnd Test => test arrays");
//  
//  }
}

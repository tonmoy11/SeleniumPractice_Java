package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_Asserts {
  @Test
  public void testSum() {
	  System.out.println("Running Test -> testSum");
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.SumNumbers(1, 3);
	  Assert.assertEquals(result, 4);
  }

  @Test
  public void testStrings() {
	  System.out.println("Running Test -> testStrings");
	  String expectedString = "Hello World";
	  SomeClassToTest ibj = new SomeClassToTest();
	  String result = ibj.addStrings("Hello ", "World");
	  Assert.assertEquals(result, expectedString);
  }

  @Test
  public void testArrays() {
  System.out.println("Running Test => testarrays");
  int [] expectedArrays = {1, 2, 3, 4};
  SomeClassToTest kbj = new SomeClassToTest();
  int [] result = kbj.getArray();
  Assert .assertEquals(result , expectedArrays);
  System.out.println("\nEnd Test => test arrays");
  
  }
}

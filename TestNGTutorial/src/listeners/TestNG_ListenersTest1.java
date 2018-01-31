package listeners;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_ListenersTest1 {
 
  @BeforeClass
  public void setUp() {
	  System.out.println("Code in Before the class");
  }

  @AfterClass
  public void cleanUp() {
	  System.out.println("Code in After the class");

  }

  @Test
  public void testMethod1() {
	  System.out.println("Code in testMethod1");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Code in testMethod1");
	  Assert.assertTrue(false);
  }
  
}

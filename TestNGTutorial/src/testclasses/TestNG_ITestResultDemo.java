package testclasses;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


public class TestNG_ITestResultDemo {
	
  @Test
  public void testMethod1() {
	  System.out.println("Running -> testMethod1");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running -> testMethod2");
  }
  
  
//  @Test
//  public void testMethod3() {
//	  System.out.println("Running -> testMethod2");

//  }
  
  
  
  @AfterMethod
  public void afterMethod(ITestResult testresult) {
	  
	  if(testresult.getStatus() == ITestResult.FAILURE){
		  System.out.println(testresult.getMethod().getMethodName());

	  }
	  if(testresult.getStatus() == ITestResult.FAILURE){
		  System.out.println("successful: " +testresult.getStartMillis());
	  }
		  
		  
  }

}

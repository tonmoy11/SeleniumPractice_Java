package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Grouping {
  
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  System.out.println("Before class");
  }
  
  @Test(groups = {"cars", "suv"})
  public void testBMWX6() {
	  System.out.println("Running Test - BMW X6");
  }
  
  @Test(groups = {"cars","sedan"})
  public void testAudi6() {
	  System.out.println("Running test - Audi67");
  }
  
  @Test(groups = {"bikes"})
  public void testNinja() {
	  System.out.println("Running test - Kawasaki Ninja");
  }
  
  @Test (groups = {"bikes"})
  public void testsHondaCBR() {
	  System.out.println("Running test - Honda CBR");
  }
  
  @AfterClass (alwaysRun = true)
  public void afterClass() {
	  System.out.println("After class");

  }

}

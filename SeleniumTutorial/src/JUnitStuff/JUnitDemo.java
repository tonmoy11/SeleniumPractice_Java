package JUnitStuff;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitDemo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("a");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("b");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("c");

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("d");

	}

}

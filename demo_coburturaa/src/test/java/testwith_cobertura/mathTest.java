/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package testwith_cobertura;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author :IRFAN
 *TIME:7:02:23 pm
 * DATE:05-Jun-2017
 *PROJECTNAME:demo_coburturaa
 */
public class mathTest {

	math m=new math();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link testwith_cobertura.math#sum(int, int)}.
	 */
	@Test
	public void testSum() {
		System.out.println("froom sum");
		assertEquals(10, m.sum(5, 5));
		
	}

	/**
	 * Test method for {@link testwith_cobertura.math#sub(int, int)}.
	 */
	@Test
	public void testSub() {
		System.out.println("froom sub");
		assertEquals(0, m.sub(5, 5));
	}

	/**
	 * Test method for {@link testwith_cobertura.math#div(int, int)}.
	 */
	@Test
	public void testDiv() {
		System.out.println("froom div");
		assertEquals(5, m.div(10, 2));
	}

	/**
	 * Test method for {@link testwith_cobertura.math#mul(int, int)}.
	 */
	@Test
	public void testMul() {
		System.out.println("froom smul");
		assertEquals(25, m.mul(5, 5));
	}
}

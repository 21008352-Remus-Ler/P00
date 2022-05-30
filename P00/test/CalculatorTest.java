import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
int a,b;
Calculator cal;
	@Before
	public void setUp() throws Exception {
	
	a = 4321;
	b = 1234;
	cal = new Calculator();
	}
	@Test
	public void testAdd() {
				 
			int expected = 5555;
			int actual =cal.add(a, b);
			// assert
			assertEquals(expected , actual);

	}
	@Test
	public void testSub() {
				 
			int expected = 3087;
			int actual =cal.subtract(a, b);
			// assert
			assertEquals(expected , actual);

	}
	@Test
	public void testmultiply() {
				 
			int expected = 5332114;
			int actual =cal.multiple(a, b);
			// assert
			assertEquals(expected , actual);
	}
	@Test
	public void testdivide() {
				 
			int expected = (int) 3.50162;
			int actual =cal.divide(a, b);
			// assert
			assertEquals(expected , actual);
	}
	@After
	public void tearDown() throws Exception {
	}
}

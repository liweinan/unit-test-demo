package javaProj;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private int max;
	private int a;
	private int b;
	private Calculator calc;

	@Before
	public void prepareSomeNumbers() {
		this.max = Integer.MAX_VALUE;
		this.a = 1;
		this.b = 1;
		this.calc = new CalculatorImpl();
	}

	@After
	public void testFinished() {
		this.max = 0;
		this.a = 0;
		this.b = 0;
		System.out.println("Done.");
	}

	@Test
	public void testAdd() {
		assertEquals(2, calc.add(a, b));
	}

	@Test(expected = AssertionError.class)
	public void testOverflow() {
		assertEquals((long) max + max, (long) calc.add(max, max));		
	}
}

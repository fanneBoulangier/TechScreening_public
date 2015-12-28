package fibonacci;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class FibonacciTest {
	
	@Test
	public void fibonacci() {
		assertEquals(0, new Fibonacci().calculate(0));
		assertEquals(1, new Fibonacci().calculate(1));
		assertEquals(1, new Fibonacci().calculate(2));
		assertEquals(2, new Fibonacci().calculate(3));
		assertEquals(3, new Fibonacci().calculate(4));
		assertEquals(5, new Fibonacci().calculate(5));
		assertEquals(8, new Fibonacci().calculate(6));
		assertEquals(13, new Fibonacci().calculate(7));
		assertEquals(21, new Fibonacci().calculate(8));
		assertEquals(34, new Fibonacci().calculate(9));
		assertEquals(55, new Fibonacci().calculate(10));
		assertEquals(89, new Fibonacci().calculate(11));
		assertEquals(144, new Fibonacci().calculate(12));
		assertEquals(233, new Fibonacci().calculate(13));
		assertEquals(377, new Fibonacci().calculate(14));
		assertEquals(610, new Fibonacci().calculate(15));
		assertEquals(987, new Fibonacci().calculate(16));
		assertEquals(1597, new Fibonacci().calculate(17));
		assertEquals(2584, new Fibonacci().calculate(18));
		assertEquals(4181, new Fibonacci().calculate(19));
		assertEquals(6765, new Fibonacci().calculate(20));
	}

}

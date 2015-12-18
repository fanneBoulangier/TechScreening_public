package fibonacci;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class FibonacciTest {
	
	@Test
	public void fibonacci() {
		assertEquals(0, new Fibonacci().bereken(0));
		assertEquals(1, new Fibonacci().bereken(1));
		assertEquals(1, new Fibonacci().bereken(2));
		assertEquals(2, new Fibonacci().bereken(3));
		assertEquals(3, new Fibonacci().bereken(4));
		assertEquals(5, new Fibonacci().bereken(5));
		assertEquals(8, new Fibonacci().bereken(6));
		assertEquals(13, new Fibonacci().bereken(7));
		assertEquals(21, new Fibonacci().bereken(8));
		assertEquals(34, new Fibonacci().bereken(9));
		assertEquals(55, new Fibonacci().bereken(10));
		assertEquals(89, new Fibonacci().bereken(11));
		assertEquals(144, new Fibonacci().bereken(12));
		assertEquals(233, new Fibonacci().bereken(13));
		assertEquals(377, new Fibonacci().bereken(14));
		assertEquals(610, new Fibonacci().bereken(15));
		assertEquals(987, new Fibonacci().bereken(16));
		assertEquals(1597, new Fibonacci().bereken(17));
		assertEquals(2584, new Fibonacci().bereken(18));
		assertEquals(4181, new Fibonacci().bereken(19));
		assertEquals(6765, new Fibonacci().bereken(20));
	}

}

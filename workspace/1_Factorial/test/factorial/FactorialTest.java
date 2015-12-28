package factorial;

import static factorial.Factorial.factorial;
import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
	
	@Test
	public void nultemtwintigFaculteit() {
		assertEquals(1, factorial(0));
		assertEquals(1, factorial(1));
		assertEquals(2, factorial(2));
		assertEquals(6, factorial(3));
		assertEquals(24, factorial(4));
		assertEquals(120, factorial(5));
		assertEquals(720, factorial(6));
		assertEquals(5040, factorial(7));
		assertEquals(40320, factorial(8));
		assertEquals(362880, factorial(9));
		assertEquals(3628800, factorial(10));
		assertEquals(39916800, factorial(11));
		assertEquals(479001600, factorial(12));
		assertEquals(6227020800l, factorial(13));
		assertEquals(87178291200l, factorial(14));
		assertEquals(1307674368000l, factorial(15));
		assertEquals(20922789888000l, factorial(16));
		assertEquals(355687428096000l, factorial(17));
		assertEquals(6402373705728000l, factorial(18));
		assertEquals(121645100408832000l, factorial(19));
		assertEquals(2432902008176640000l, factorial(20));
	}
	

}

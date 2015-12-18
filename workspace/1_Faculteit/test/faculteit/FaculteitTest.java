package faculteit;

import static faculteit.Faculteit.faculteit;
import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class FaculteitTest {
	
	@Test
	public void nultemtwintigFaculteit() {
		assertEquals(1, faculteit(0));
		assertEquals(1, faculteit(1));
		assertEquals(2, faculteit(2));
		assertEquals(6, faculteit(3));
		assertEquals(24, faculteit(4));
		assertEquals(120, faculteit(5));
		assertEquals(720, faculteit(6));
		assertEquals(5040, faculteit(7));
		assertEquals(40320, faculteit(8));
		assertEquals(362880, faculteit(9));
		assertEquals(3628800, faculteit(10));
		assertEquals(39916800, faculteit(11));
		assertEquals(479001600, faculteit(12));
		assertEquals(6227020800l, faculteit(13));
		assertEquals(87178291200l, faculteit(14));
		assertEquals(1307674368000l, faculteit(15));
		assertEquals(20922789888000l, faculteit(16));
		assertEquals(355687428096000l, faculteit(17));
		assertEquals(6402373705728000l, faculteit(18));
		assertEquals(121645100408832000l, faculteit(19));
		assertEquals(2432902008176640000l, faculteit(20));
	}
	

}

package math;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class GreatestCommonDenominatorTest {
	
	@Test
	public void sameNumbers() {
		assertEquals(4, MathUtil.gcd(4, 4));
	}
	
	@Test
	public void differentNumbers() {
		assertEquals(6, MathUtil.gcd(12, 6));
		assertEquals(5, MathUtil.gcd(20, 15));
		assertEquals(2, MathUtil.gcd(206, 40));
		assertEquals(21, MathUtil.gcd(252, 105));
		assertEquals(60, MathUtil.gcd(1140, 900));
		assertEquals(4, MathUtil.gcd(752, 372));
	}

}

package math;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class GrootsteGemeneDelerTest {
	
	@Test
	public void zelfdeGetallen() {
		assertEquals(4, MathUtil.ggd(4, 4));
	}
	
	@Test
	public void verschillendeGetallen() {
		assertEquals(6, MathUtil.ggd(12, 6));
		assertEquals(5, MathUtil.ggd(20, 15));
		assertEquals(2, MathUtil.ggd(206, 40));
		assertEquals(21, MathUtil.ggd(252, 105));
		assertEquals(60, MathUtil.ggd(1140, 900));
		assertEquals(4, MathUtil.ggd(752, 372));
	}

}

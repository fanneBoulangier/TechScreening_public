package sqrt;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class SquareRootBabylonianMethodTest {

	private static final double DELTA = 0.000000009;
	
	@Test
	public void sqrtOne() {
		assertEquals(1d, MathUtil.sqrt(1d), DELTA);
	}
	
	@Test
	public void sqrtTwo() {
		assertEquals(1.41421356d, MathUtil.sqrt(2d), DELTA);
	}
	
	@Test
	public void sqrtThree() {
		assertEquals(1.73205080d, MathUtil.sqrt(3d), DELTA);
	}
	
	@Test
	public void sqrtFour() {
		assertEquals(2d, MathUtil.sqrt(4d), DELTA);
	}
	
	@Test
	public void sqrtFive() {
		assertEquals(2.23606797d, MathUtil.sqrt(5d), DELTA);
	}
	
}

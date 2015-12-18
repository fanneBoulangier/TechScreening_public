package util;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class InterleaveInStringTest {

	@Test
	public void interleaveInEmptyString() {
		assertEquals("", StringUtil.interleave("", 'a', 2));
	}
	
	@Test
	public void interleavingAtPositionLargerThanInterleaveInterval() {
		assertEquals("hallo", StringUtil.interleave("hallo", 'a', 7));
	}
	
	@Test
	public void interleavingExactlyAtInterleaveInterval() {
		assertEquals("halloa", StringUtil.interleave("hallo", 'a', 5));
	}
	
	@Test
	public void interleavingMultipleTimes() {
		assertEquals("blablabla", StringUtil.interleave("blblbl", 'a', 2));
	}
}

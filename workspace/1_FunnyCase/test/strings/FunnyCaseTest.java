package strings;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class FunnyCaseTest {
	
	@Test
	public void emptyString() {
		assertEquals("", StringUtil.funnyCase(""));
	}
	
	@Test
	public void someString() {
		assertEquals("FuNnY cAsE", StringUtil.funnyCase("Funny Case"));
	}

}

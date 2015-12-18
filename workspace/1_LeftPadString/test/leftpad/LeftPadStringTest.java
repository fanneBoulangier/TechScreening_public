package leftpad;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import org.junit.Test;

public class LeftPadStringTest {

	@Test
	public void nullString() {
		assertNull(new StringUtil().leftPad(null, 1, 'c'));
	}
	
	@Test
	public void padEmptyString() {
		assertEquals("zzz", new StringUtil().leftPad("", 3, 'z'));
	}
	
	@Test
	public void noPaddingNeeded()  {
		assertEquals("bat", new StringUtil().leftPad("bat", 3, 'x'));
		assertEquals("bat", new StringUtil().leftPad("bat", 2, 'x'));
		assertEquals("bat", new StringUtil().leftPad("bat", 1, 'x'));
		assertEquals("bat", new StringUtil().leftPad("bat", 0, 'x'));
		assertEquals("bat", new StringUtil().leftPad("bat", -1, 'x'));
	}
	
	@Test
	public void leftPadString() {
		assertEquals("xxbat", new StringUtil().leftPad("bat", 5, 'x'));
		assertEquals("eeeeeeman", new StringUtil().leftPad("man", 9, 'e'));
	}
}

package rightpad;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import org.junit.Test;

public class RightPadStringTest {
	
	@Test
	public void nullString() {
		assertNull(new StringUtil().rightPad(null, 1, 'c'));
	}
	
	@Test
	public void padEmptyString() {
		assertEquals("zzz", new StringUtil().rightPad("", 3, 'z'));
	}
	
	@Test
	public void noPaddingNeeded() {
		assertEquals("bat", new StringUtil().rightPad("bat", 3, 'x'));
		assertEquals("bat", new StringUtil().rightPad("bat", 2, 'x'));
		assertEquals("bat", new StringUtil().rightPad("bat", 1, 'x'));
		assertEquals("bat", new StringUtil().rightPad("bat", 0, 'x'));
		assertEquals("bat", new StringUtil().rightPad("bat", -1, 'x'));
	}
	
	@Test
	public void rightPadString() {
		assertEquals("batxx", new StringUtil().rightPad("bat", 5, 'x'));
		assertEquals("maneeeeee", new StringUtil().rightPad("man", 9, 'e'));
	}

}

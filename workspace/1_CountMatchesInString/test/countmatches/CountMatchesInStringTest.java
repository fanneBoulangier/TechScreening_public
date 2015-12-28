package countmatches;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class CountMatchesInStringTest {
	
	@Test
	public void noMatchesInNullString() {
		assertEquals(0, StringUtil.countMatches(null, 'b'));
	}
	
	@Test
	public void noMatchesInEmptyString() {
		assertEquals(0, StringUtil.countMatches("", 'b'));
	}
	
	@Test
	public void noMatchesInNonEmptyString() {
		assertEquals(0, StringUtil.countMatches("this string has no matches", 'b'));
	}
	
	@Test
	public void oneMatchInNonEmptyString() {
		assertEquals(1, StringUtil.countMatches("this string boldly has matches", 'b'));
	}
	
	@Test
	public void multipleMatchesInNonEmptyString() {
		assertEquals(3, StringUtil.countMatches("this string contains b even more than one time b", 'b'));
	}

}

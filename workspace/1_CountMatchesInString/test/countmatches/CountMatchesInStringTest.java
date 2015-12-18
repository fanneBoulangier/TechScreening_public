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
		assertEquals(0, StringUtil.countMatches("deze string evat niet de letter ee", 'b'));
	}
	
	@Test
	public void oneMatchInNonEmptyString() {
		assertEquals(1, StringUtil.countMatches("deze string bevat de letter ee", 'b'));
	}
	
	@Test
	public void multipleMatchesInNonEmptyString() {
		assertEquals(3, StringUtil.countMatches("deze string bevat wel de letter b, meer dan 1 keer de letter b zelfs", 'b'));
	}

}

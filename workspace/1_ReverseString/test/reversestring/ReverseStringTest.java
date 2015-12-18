package reversestring;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {
	
	@Test
	public void reverseLegeString() {
		assertEquals("", new ReverseString().reverse(""));
	}
	
	@Test
	public void reverseEenCharacterString() {
		assertEquals("a", new ReverseString().reverse("a"));
	}
	
	@Test
	public void reverseMeerdereCharacterString() {
		assertEquals("abcdefg", new ReverseString().reverse("gfedcba"));
	}
	

}

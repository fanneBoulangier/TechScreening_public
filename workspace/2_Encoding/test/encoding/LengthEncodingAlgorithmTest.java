package encoding;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LengthEncodingAlgorithmTest {

	private LengthEncodingAlgorithm lengthEncoding;

	@Before
	public void setup() throws Exception {
		lengthEncoding = new LengthEncodingAlgorithm();
	}

	@Test
	public void emptyString() {
		assertEquals("", lengthEncoding.encode(""));
	}

	@Test
	public void noEncodingRequired() {
		assertEquals("abc", lengthEncoding.encode("abc"));
	}

	@Test
	public void encodeCompleteString() {
		assertEquals("3a", lengthEncoding.encode("aaa"));
	}

	@Test
	public void encodeOnlyFirstCharacters() {
		assertEquals("3abc", lengthEncoding.encode("aaabc"));
	}

	@Test
	public void encodeInTheMiddle() {
		assertEquals("a4bc", lengthEncoding.encode("abbbbc"));
	}

	@Test
	public void encodeAtTheEnd() {
		assertEquals("ab2c", lengthEncoding.encode("abcc"));
	}

	@Test
	public void encodeTheSameCharacterMultipleTimes() {
		assertEquals("4ab2ac5a", lengthEncoding.encode("aaaabaacaaaaa"));
	}

	@Test
	public void encodeMultipleTimes() {
		assertEquals("4ab3c", lengthEncoding.encode("aaaabccc"));
	}
}

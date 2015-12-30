package decodering;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class LengthDecodingAlgorithmTest {

	private LengthDecodingAlgorithm lengthDecoding;

	@Before
	public void setup() throws Exception {
		lengthDecoding = new LengthDecodingAlgorithm();
	}

	@Test
	public void emptyString() {
		assertEquals("", lengthDecoding.decode(""));
	}

	@Test
	public void noDecodingNeeded() {
		assertEquals("abc", lengthDecoding.decode("abc"));
	}

	@Test
	public void decodeCompleteString() {
		assertEquals("aaa", lengthDecoding.decode("3a"));
	}

	@Test
	public void decodeFirstCharacters() {
		assertEquals("aaabc", lengthDecoding.decode("3abc"));
	}

	@Test
	public void decodeInTheMiddle() {
		assertEquals("abbbbc", lengthDecoding.decode("a4bc"));
	}

	@Test
	public void decodeAtTheEnd() {
		assertEquals("abcc", lengthDecoding.decode("ab2c"));
	}

	@Test
	public void multipleDecodingsOfTheSameCharacter() {
		assertEquals("aaaabaaaaaaaaaaaaaacaaaaa", lengthDecoding.decode("4ab14ac5a"));
	}

}

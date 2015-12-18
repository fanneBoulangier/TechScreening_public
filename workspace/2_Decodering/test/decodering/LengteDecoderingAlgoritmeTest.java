package decodering;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class LengteDecoderingAlgoritmeTest {

	private LengteDecoderingAlgoritme lengteDecodering;

	@Before
	public void setup() throws Exception {
		lengteDecodering = new LengteDecoderingAlgoritme();
	}

	@Test
	public void legeString() {
		assertEquals("", lengteDecodering.decodeer(""));
	}

	@Test
	public void geenDecoderingNodig() {
		assertEquals("abc", lengteDecodering.decodeer("abc"));
	}

	@Test
	public void decodeerVolledigeString() {
		assertEquals("aaa", lengteDecodering.decodeer("3a"));
	}

	@Test
	public void decodeerEersteLetters() {
		assertEquals("aaabc", lengteDecodering.decodeer("3abc"));
	}

	@Test
	public void decodeerLettersInMidden() {
		assertEquals("abbbbc", lengteDecodering.decodeer("a4bc"));
	}

	@Test
	public void decodeerLettersOpEinde() {
		assertEquals("abcc", lengteDecodering.decodeer("ab2c"));
	}

	@Test
	public void meerdereAaneenschakelingenVanHetzelfdeKarakter() {
		assertEquals("aaaabaaaaaaaaaaaaaacaaaaa", lengteDecodering.decodeer("4ab14ac5a"));
	}

}

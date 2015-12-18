package encodering;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LengteEncoderingAlgoritmeTest {

	private LengteEncoderingAlgoritme lengteEncodering;

	@Before
	public void setup() throws Exception {
		lengteEncodering = new LengteEncoderingAlgoritme();
	}

	@Test
	public void legeString() {
		assertEquals("", lengteEncodering.encodeer(""));
	}

	@Test
	public void geenEncoderingNodig() {
		assertEquals("abc", lengteEncodering.encodeer("abc"));
	}

	@Test
	public void encodeerVolledigeString() {
		assertEquals("3a", lengteEncodering.encodeer("aaa"));
	}

	@Test
	public void encodeerEersteLetters() {
		assertEquals("3abc", lengteEncodering.encodeer("aaabc"));
	}

	@Test
	public void encodeerLettersInMidden() {
		assertEquals("a4bc", lengteEncodering.encodeer("abbbbc"));
	}

	@Test
	public void encodeerLettersOpEinde() {
		assertEquals("ab2c", lengteEncodering.encodeer("abcc"));
	}

	@Test
	public void meerdereAaneenschakelingenVanHetzelfdeKarakter() {
		assertEquals("4ab2ac5a", lengteEncodering.encodeer("aaaabaacaaaaa"));
	}

	@Test
	public void meerdereAaneenschakelingenVanVerschillendeKarakters() {
		assertEquals("4ab3c", lengteEncodering.encodeer("aaaabccc"));
	}
}

package palindroom;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;


public class PalindroomTest {
	
	@Test
	public void legeStringIsEenPalindroom() {
		assertTrue(new Palindroom().isPalindroom(""));
	}
	
	@Test
	public void eenKarakterStringIsEenPalindroom() {
		assertTrue(new Palindroom().isPalindroom("a"));
	}
	
	@Test
	public void palindroom() {
		assertTrue(new Palindroom().isPalindroom("koortsmeetsysteemstrook"));
	}
	
	@Test
	public void geenPalindroom() {
		assertFalse(new Palindroom().isPalindroom("koekoeksklok"));
	}
	

}

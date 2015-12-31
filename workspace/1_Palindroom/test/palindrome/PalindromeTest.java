package palindrome;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;


public class PalindromeTest {
	
	@Test
	public void legeStringIsEenPalindroom() {
		assertTrue(new Palindrome().isPalindrome(""));
	}
	
	@Test
	public void eenKarakterStringIsEenPalindroom() {
		assertTrue(new Palindrome().isPalindrome("a"));
	}
	
	@Test
	public void palindroom() {
		assertTrue(new Palindrome().isPalindrome("koortsmeetsysteemstrook"));
	}
	
	@Test
	public void geenPalindroom() {
		assertFalse(new Palindrome().isPalindrome("koekoeksklok"));
	}
	

}

package wordchains;
package wordchains;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class WordChainsTest {
	
	@Test
	public void reallySimpleWordChain() {
		assertEquals(asList("d", "y"), new WordChain(lettersOfAlphabet()).wordchainFromTo("d", "y"));
	}
	
	@Test
	public void twoLetterWordChain() {
		assertEquals(asList("eb", "el", "dl"), new WordChain(twoLetterWords()).wordchainFromTo("eb", "dl"));
	}
	
	@Test
	public void threeLetterWordChain() {
		assertEquals(asList("cat", "cot", "cog", "dog"), new WordChain(threeLetterWords()).wordchainFromTo("cat", "dog"));
	}
	
	private List<String> lettersOfAlphabet() {
		return asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", 
				"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
	}
	
	private List<String> twoLetterWords() {
		return asList("qa", "eb", "dl", "df", "op", "fu", "hi", "ii", "pj", "fo", "el");
	}

	private List<String> threeLetterWords() {
		return asList("pot", "toc", "pac", "man", "cot", "dog", "cat", "tca", "cto", "cog", "min", "tip", "pit", "sit");
	}
}



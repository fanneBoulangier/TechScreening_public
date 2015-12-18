package wordchains;

import java.util.List;

public class WordChain {

	private List<String> possibleWords;

	public WordChain(List<String> possibleWords) {
		this.possibleWords = possibleWords;
	}

	/**
	 * Gebruik makend van de lijst van possible words, maakt wordchain een ketting van woorden die je van from naar to leiden met telkens
	 * één letter verschil.
	 * bvb cat -> dog : (cat, cot, cog, dog)
	 * @param from from 
	 * @param to to 
	 * @return wordchain from to
	 */
	public List<String> wordchainFromTo(String from, String to) {
		throw new UnsupportedOperationException("implement me!");
	}
	
	

}

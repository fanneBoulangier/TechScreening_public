package wordchains;

import java.util.List;

public class WordChain {

	private List<String> possibleWords;

	public WordChain(List<String> possibleWords) {
		this.possibleWords = possibleWords;
	}

	/**
	 * Returns a chain of words going from aFrom to aTo where every link only changes one character
	 * Example cat -> dog : (cat, cot, cog, dog)
	 * @param aFrom from
	 * @param aTo to
	 * @return wordchain from to
	 */
	public List<String> wordchainFromTo(String aFrom, String aTo) {
		throw new UnsupportedOperationException("implement me!");
	}
	
	

}

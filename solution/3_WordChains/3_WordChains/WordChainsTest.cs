using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using wordchains;

namespace test
{
    [TestClass]
    public class WordChainsTest
    {
        [TestMethod]
        public void reallySimpleWordChain() {
		    CollectionAssert.AreEqual(asList("d", "y"), new WordChain(lettersOfAlphabet()).wordchainFromTo("d", "y"));
	    }
	
	    [TestMethod]
	    public void twoLetterWordChain() {
            CollectionAssert.AreEqual(asList("eb", "el", "dl"), new WordChain(twoLetterWords()).wordchainFromTo("eb", "dl"));
	    }

        [TestMethod]
	    public void threeLetterWordChain() {
            CollectionAssert.AreEqual(asList("cat", "cot", "cog", "dog"), new WordChain(threeLetterWords()).wordchainFromTo("cat", "dog"));
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

        private List<String> asList(params String[] elements)
        {
            return new List<String>(elements);
        }
    }
}

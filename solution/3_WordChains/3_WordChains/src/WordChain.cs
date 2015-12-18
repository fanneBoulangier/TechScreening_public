using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace wordchains
{
    public class WordChain
    {
        private List<String> possibleWords;

        public WordChain(List<String> possibleWords)
        {
            this.possibleWords = possibleWords;
        }

        /// <summary>
        /// Gebruik makend van de lijst van possible words, maakt wordchain een ketting van woorden die je van from naar to leiden met telkens
	    /// één letter verschil.
	    /// bvb cat -> dog : (cat, cot, cog, dog)
        /// </summary>
        /// <param name="from">from</param>
        /// <param name="to">to</param>
        /// <returns>wordchain from to</returns>
        public List<String> wordchainFromTo(String from, String to)
        {
            throw new NotImplementedException("implement me!");
        }
    }
}

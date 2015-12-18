using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace permutaties
{
    public class ListUtil
    {
        /// <summary>
        /// Permuteer geeft een set terug met elke permutatie van de gegeven set. 
	    /// Permuteren is elke mogelijke volgorde van de elementen overlopen.
	    /// Bvb (1 2 3) => ((1 2 3) (1 3 2) (2 1 3) (2 3 1) (3 1 2) (3 2 1))
        /// </summary>
        /// <param name="toPermute">de te permuteren set</param>
        /// <returns>de set van permutaties van de gegeven set</returns>
        public static HashSet<List<int>> permuteer(HashSet<int> toPermute)
        {
            throw new NotImplementedException("implement me");
        }

    }
}

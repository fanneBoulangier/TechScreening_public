using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace src.lists
{
    public class FilterableArrayList<T> : List<T>, FilterableList<T> 
    {
        /// <summary>
        /// Filtert de elementen uit de lijst gegeven de filterPredicate en
	    /// geeft de gefilterde lijst terug. Deze methode geeft telkens 
	    /// een nieuwe gefilterde lijst terug. Er is geen connectie meer 
	    /// met de originele lijst.
        /// </summary>
        /// <param name="filterPredicate"></param>
        /// <returns></returns>
        public List<T> filter(FilterPredicate<T> filterPredicate)
        {
            throw new NotImplementedException("implement me");
        }
    }
}

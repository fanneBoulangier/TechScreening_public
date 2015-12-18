using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using src.lists;

namespace _3_FilterableList
{
    [TestClass]
    public class FilterableArrayListTest
    {
        [TestMethod]
        public void filterFiltertAlleElementenUitLijstDieMatchen() {
		    FilterableList<long> filterableList = new FilterableArrayList<long>();
		    filterableList.Add(1L);
            filterableList.Add(4L);
            filterableList.Add(14L);
            filterableList.Add(15L);
            filterableList.Add(16L);
            filterableList.Add(17L);
		
		    List<long> result = filterableList.filter(new GroterDan15FilterPredicate());
		    Assert.AreEqual(2, result.Count);
            Assert.AreEqual(16L, result[0]);
            Assert.AreEqual(17L, result[1]);
	    }
	
	    [TestMethod]
	    public void erIsGeenConnectieTussenGefilterdeLijstEnOrigineleLijst() {
		    FilterableList<long> filterableList = new FilterableArrayList<long>();
            filterableList.Add(15L);
            filterableList.Add(16L);
            filterableList.Add(17L);
		
		    List<long> result = filterableList.filter(new GroterDan15FilterPredicate());

            filterableList.Add(18L);

            Assert.AreEqual(2, result.Count);
            Assert.AreEqual(16L, result[0]);
            Assert.AreEqual(17L, result[1]);
	    }

	    private class GroterDan15FilterPredicate : FilterPredicate<long> {

		    public bool matches(long aLong) {
			    return aLong > 15L;
		    }
		
	    }
    }
}

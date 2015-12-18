using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using listutils;

namespace test
{
    [TestClass]
    public class FindMinValueInListTest
    {
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
	    public void emptyListThrowsIllegalArgumentException(){
		    ListUtil.findMinValueInList();
	    }

        [TestMethod]
	    public void geefkleinste() {
		    Assert.AreEqual(1, ListUtil.findMinValueInList(4, 2, 1, 5, 3, 1, 5, 9));
	    }
    }
}

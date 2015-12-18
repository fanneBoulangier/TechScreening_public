using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using lists;

namespace test
{
    [TestClass]
    public class HalveerInLijstTest
    {
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
	    public void halveerInLijstVanNulIsOngeldig() {
		    ListUtil.halveerInLijst(0);
	    }
	
	    [TestMethod]
	    public void halveerInLijstVanEen() {
            List<int> actual = ListUtil.halveerInLijst(1);

            CollectionAssert.AreEqual(new List<int>(new int[] { 1 }), actual);
	    }
	
	    [TestMethod]
	    public void halveerInLijstTwee() {
            List<int> actual = ListUtil.halveerInLijst(2);

            CollectionAssert.AreEqual(new List<int>(new int[] { 2, 1 }), actual);
	    }

        [TestMethod]
	    public void halveerInLijstGrotereGetallen() {
            List<int> actual = ListUtil.halveerInLijst(100);

            CollectionAssert.AreEqual(new List<int>(new int[] { 100, 50, 25, 12, 6, 3, 1 }), actual);
	    }
    }
}

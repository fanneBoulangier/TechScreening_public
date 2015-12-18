using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using nums;

namespace test
{
    [TestClass]
    public class SumOfSquaresTest
    {
        [TestMethod]
        public void emptyList() {
		    Assert.AreEqual(0, ListUtil.sumOfSquares(new List<int>()));
	    }

        [TestMethod]
	    public void sumOfSquares() {
            Assert.AreEqual(55, ListUtil.sumOfSquares(new List<int>(new int[] {1, 2, 3, 4, 5})));
	    }
    }
}

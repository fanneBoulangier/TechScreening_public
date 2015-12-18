using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using listutil;

namespace test
{
    [TestClass]
    public class ZelfdePariteitTest
    {
        [TestMethod]
        public void legeLijst()  {
		    CollectionAssert.AreEqual(new List<int>(), ListUtil.zelfdePariteit(1, new List<int>()));
	    }
	
	    [TestMethod]
	    public void oneven()  {
            CollectionAssert.AreEqual(new List<int>(new int[] { 1, 3, 5, 7, 9 }), ListUtil.zelfdePariteit(1, new List<int>(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })));
	    }

        [TestMethod]
	    public void even()  {
            CollectionAssert.AreEqual(new List<int>(new int[] { 2, 4, 6, 8, 10 }), ListUtil.zelfdePariteit(2, new List<int>(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })));
	    }
    }
}

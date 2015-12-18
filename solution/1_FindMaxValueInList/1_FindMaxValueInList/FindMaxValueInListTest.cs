using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using listutils;

namespace test
{
    [TestClass]
    public class FindMaxValueInListTest
    {
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
	    public void emptyListThrowsException() {
		    ListUtil.findMaxValueInList();
	    }
	
	    [TestMethod]
	    public void listWithOneElement() {
		    Assert.AreEqual(2, ListUtil.findMaxValueInList(2));
	    }
	
	    [TestMethod]
	    public void listWithMoreElementsMaxValueFirst() {
		    Assert.AreEqual(2, ListUtil.findMaxValueInList(2, 1, 0, 1));
	    }
	
	    [TestMethod]
	    public void listWithMoreElementsMaxValueInTheMiddle() {
		    Assert.AreEqual(2, ListUtil.findMaxValueInList(1, 1, 0, 1, 2, 1));
	    }
	
	    [TestMethod]
	    public void listWithMoreElementsMaxValueLast() {
		    Assert.AreEqual(2, ListUtil.findMaxValueInList(1, 1, 1, 1, 0, 2));
	    }
    }
}

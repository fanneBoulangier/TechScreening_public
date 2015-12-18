using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using util;

namespace test
{
    [TestClass]
    public class InterleaveInStringTest
    {
        [TestMethod]
        public void interleaveInEmptyString() {
		    Assert.AreEqual("", StringUtil.interleave("", 'a', 2));
	    }
	
	    [TestMethod]
	    public void interleavingAtPositionLargerThanInterleaveInterval() {
            Assert.AreEqual("hallo", StringUtil.interleave("hallo", 'a', 7));
	    }
	
	    [TestMethod]
	    public void interleavingExactlyAtInterleaveInterval() {
            Assert.AreEqual("halloa", StringUtil.interleave("hallo", 'a', 5));
	    }

        [TestMethod]
	    public void interleavingMultipleTimes() {
            Assert.AreEqual("blablabla", StringUtil.interleave("blblbl", 'a', 2));
	    }
    }
}

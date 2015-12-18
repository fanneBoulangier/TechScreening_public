using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using rightpad;

namespace test
{
    [TestClass]
    public class RightPadStringTest
    {
        [TestMethod]
        public void nullString() {
		    Assert.IsNull(new StringUtil().rightPad(null, 1, 'c'));
	    }
	
	    [TestMethod]
	    public void padEmptyString() {
		    Assert.AreEqual("zzz", new StringUtil().rightPad("", 3, 'z'));
	    }
	
	    [TestMethod]
	    public void noPaddingNeeded() {
            Assert.AreEqual("bat", new StringUtil().rightPad("bat", 3, 'x'));
            Assert.AreEqual("bat", new StringUtil().rightPad("bat", 2, 'x'));
            Assert.AreEqual("bat", new StringUtil().rightPad("bat", 1, 'x'));
            Assert.AreEqual("bat", new StringUtil().rightPad("bat", 0, 'x'));
            Assert.AreEqual("bat", new StringUtil().rightPad("bat", -1, 'x'));
	    }

        [TestMethod]
	    public void rightPadString() {
            Assert.AreEqual("batxx", new StringUtil().rightPad("bat", 5, 'x'));
            Assert.AreEqual("maneeeeee", new StringUtil().rightPad("man", 9, 'e'));
	    }
    }
}

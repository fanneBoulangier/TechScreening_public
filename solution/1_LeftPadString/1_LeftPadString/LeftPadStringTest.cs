using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using leftpad;

namespace test
{
    [TestClass]
    public class LeftPadStringTest
    {
        [TestMethod]
        public void nullString() {
		    Assert.IsNull(new StringUtil().leftPad(null, 1, 'c'));
	    }
	
	    [TestMethod]
	    public void padEmptyString() {
		    Assert.AreEqual("zzz", new StringUtil().leftPad("", 3, 'z'));
	    }
	
	    [TestMethod]
	    public void noPaddingNeeded()  {
		    Assert.AreEqual("bat", new StringUtil().leftPad("bat", 3, 'x'));
		    Assert.AreEqual("bat", new StringUtil().leftPad("bat", 2, 'x'));
		    Assert.AreEqual("bat", new StringUtil().leftPad("bat", 1, 'x'));
		    Assert.AreEqual("bat", new StringUtil().leftPad("bat", 0, 'x'));
		    Assert.AreEqual("bat", new StringUtil().leftPad("bat", -1, 'x'));
	    }

        [TestMethod]
	    public void leftPadString() {
		    Assert.AreEqual("xxbat", new StringUtil().leftPad("bat", 5, 'x'));
		    Assert.AreEqual("eeeeeeman", new StringUtil().leftPad("man", 9, 'e'));
	    }
    }
}

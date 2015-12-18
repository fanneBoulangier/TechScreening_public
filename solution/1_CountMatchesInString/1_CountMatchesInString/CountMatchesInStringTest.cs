using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using countmatches;

namespace test.countmatches
{
    [TestClass]
    public class CountMatchesInStringTest
    {
        [TestMethod]
	    public void noMatchesInNullString() {
		    Assert.AreEqual(0, StringUtil.countMatches(null, 'b'));
	    }
	
	    [TestMethod]
	    public void noMatchesInEmptyString() {
            Assert.AreEqual(0, StringUtil.countMatches("", 'b'));
	    }
	
	    [TestMethod]
	    public void noMatchesInNonEmptyString() {
            Assert.AreEqual(0, StringUtil.countMatches("deze string evat niet de letter ee", 'b'));
	    }
	
	    [TestMethod]
	    public void oneMatchInNonEmptyString() {
            Assert.AreEqual(1, StringUtil.countMatches("deze string bevat de letter ee", 'b'));
	    }

        [TestMethod]
	    public void multipleMatchesInNonEmptyString() {
            Assert.AreEqual(3, StringUtil.countMatches("deze string bevat wel de letter b, meer dan 1 keer de letter b zelfs", 'b'));
	    }
    }
}

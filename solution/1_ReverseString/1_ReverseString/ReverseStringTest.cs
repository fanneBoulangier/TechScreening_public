using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using reversestring;

namespace test
{
    [TestClass]
    public class ReverseStringTest
    {
        [TestMethod]
        public void reverseLegeString() {
		    Assert.AreEqual("", new ReverseString().reverse(""));
	    }
	
	    [TestMethod]
	    public void reverseEenCharacterString() {
		    Assert.AreEqual("a", new ReverseString().reverse("a"));
	    }

        [TestMethod]
	    public void reverseMeerdereCharacterString() {
		    Assert.AreEqual("abcdefg", new ReverseString().reverse("gfedcba"));
	    }
    }
}

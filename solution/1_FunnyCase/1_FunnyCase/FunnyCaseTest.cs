using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using strings;

namespace test
{
    [TestClass]
    public class FunnyCaseTest
    {
        [TestMethod]
        public void emptyString() {
		    Assert.AreEqual("", StringUtil.funnyCase(""));
	    }

        [TestMethod]
	    public void someString() {
            Assert.AreEqual("FuNnY cAsE", StringUtil.funnyCase("Funny Case"));
	    }
    }
}

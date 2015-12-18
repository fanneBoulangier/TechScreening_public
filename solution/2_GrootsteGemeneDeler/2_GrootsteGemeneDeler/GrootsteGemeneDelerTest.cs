using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using math;

namespace test
{
    [TestClass]
    public class GrootsteGemeneDelerTest
    {
        [TestMethod]
        public void zelfdeGetallen() {
		    Assert.AreEqual(4, MathUtil.ggd(4, 4));
	    }

        [TestMethod]
	    public void verschillendeGetallen() {
		    Assert.AreEqual(6, MathUtil.ggd(12, 6));
		    Assert.AreEqual(5, MathUtil.ggd(20, 15));
		    Assert.AreEqual(2, MathUtil.ggd(206, 40));
		    Assert.AreEqual(21, MathUtil.ggd(252, 105));
		    Assert.AreEqual(60, MathUtil.ggd(1140, 900));
		    Assert.AreEqual(4, MathUtil.ggd(752, 372));
	    }
    }
}

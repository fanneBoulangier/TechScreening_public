using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using sqrt;

namespace test
{
    [TestClass]
    public class SquareRootBabylonianMethodTest
    {
        private const double DELTA = 0.000000009;

        [TestMethod]
        public void sqrtOne() {
		    Assert.AreEqual(1d, MathUtil.sqrt(1d), DELTA);
	    }
	
	    [TestMethod]
	    public void sqrtTwo() {
		    Assert.AreEqual(1.41421356d, MathUtil.sqrt(2d), DELTA);
	    }
	
	    [TestMethod]
	    public void sqrtThree() {
		    Assert.AreEqual(1.73205080d, MathUtil.sqrt(3d), DELTA);
	    }
	
	    [TestMethod]
	    public void sqrtFour() {
		    Assert.AreEqual(2d, MathUtil.sqrt(4d), DELTA);
	    }

        [TestMethod]
	    public void sqrtFive() {
		    Assert.AreEqual(2.23606797d, MathUtil.sqrt(5d), DELTA);
	    }
    }
}

using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using num;

namespace test
{
    [TestClass]
    public class SchrijfInRomeinseCijfersTest
    {
        [TestMethod]
        public void individueleRomeinseGetallen() {
		    Assert.AreEqual("I", GetalUtil.alsRomeinsCijfer(1));
		    Assert.AreEqual("V", GetalUtil.alsRomeinsCijfer(5));
		    Assert.AreEqual("X", GetalUtil.alsRomeinsCijfer(10));
		    Assert.AreEqual("L", GetalUtil.alsRomeinsCijfer(50));
		    Assert.AreEqual("C", GetalUtil.alsRomeinsCijfer(100));
		    Assert.AreEqual("D", GetalUtil.alsRomeinsCijfer(500));
		    Assert.AreEqual("M", GetalUtil.alsRomeinsCijfer(1000));
	    }
	
	    [TestMethod]
	    public void optellendeRomeinseCijfers() {
		    Assert.AreEqual("II", GetalUtil.alsRomeinsCijfer(2));
		    Assert.AreEqual("III", GetalUtil.alsRomeinsCijfer(3));
		    Assert.AreEqual("VI", GetalUtil.alsRomeinsCijfer(6));
		    Assert.AreEqual("VII", GetalUtil.alsRomeinsCijfer(7));
		    Assert.AreEqual("VIII", GetalUtil.alsRomeinsCijfer(8));
		    Assert.AreEqual("XI", GetalUtil.alsRomeinsCijfer(11));
		    Assert.AreEqual("XVII", GetalUtil.alsRomeinsCijfer(17));
		    Assert.AreEqual("XXXVIII", GetalUtil.alsRomeinsCijfer(38));
		    Assert.AreEqual("LXXII", GetalUtil.alsRomeinsCijfer(72));
		    Assert.AreEqual("LXXX", GetalUtil.alsRomeinsCijfer(80));
		    Assert.AreEqual("CXXII", GetalUtil.alsRomeinsCijfer(122));
		    Assert.AreEqual("CLIII", GetalUtil.alsRomeinsCijfer(153));
		    Assert.AreEqual("DCLXXVIII", GetalUtil.alsRomeinsCijfer(678));
		    Assert.AreEqual("MCCXXXIII", GetalUtil.alsRomeinsCijfer(1233));
		    Assert.AreEqual("MMMCCLXXII", GetalUtil.alsRomeinsCijfer(3272));
	    }

        [TestMethod]
	    public void aftrekkendeRomeinseCijfers() {
		    Assert.AreEqual("IV", GetalUtil.alsRomeinsCijfer(4));
		    Assert.AreEqual("IX", GetalUtil.alsRomeinsCijfer(9));
		    Assert.AreEqual("XXXIX", GetalUtil.alsRomeinsCijfer(39));
		    Assert.AreEqual("XLII", GetalUtil.alsRomeinsCijfer(42));
		    Assert.AreEqual("XCIX", GetalUtil.alsRomeinsCijfer(99));
		    Assert.AreEqual("CIX", GetalUtil.alsRomeinsCijfer(109));
		    Assert.AreEqual("CXIX", GetalUtil.alsRomeinsCijfer(119));
		    Assert.AreEqual("CXXIX", GetalUtil.alsRomeinsCijfer(129));
		    Assert.AreEqual("CXXXIX", GetalUtil.alsRomeinsCijfer(139));
		    Assert.AreEqual("CLXIX", GetalUtil.alsRomeinsCijfer(169));
		    Assert.AreEqual("CDIII", GetalUtil.alsRomeinsCijfer(403));
		    Assert.AreEqual("CMLXXIX", GetalUtil.alsRomeinsCijfer(979));
		    Assert.AreEqual("MCMXCIX", GetalUtil.alsRomeinsCijfer(1999));
	    }
    }
}

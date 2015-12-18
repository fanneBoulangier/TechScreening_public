using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using num;

namespace _2_SchrijfRomeinsGetalInArabischeCijfers
{
    [TestClass]
    public class SchrijfInArabischeCijfersTest
    {
        [TestMethod]
        public void individueleRomeinseGetallen() {
		    Assert.AreEqual(1, GetalUtil.alsArabischCijfer("I"));
		    Assert.AreEqual(5, GetalUtil.alsArabischCijfer("V"));
		    Assert.AreEqual(10, GetalUtil.alsArabischCijfer("X"));
		    Assert.AreEqual(50, GetalUtil.alsArabischCijfer("L"));
		    Assert.AreEqual(100, GetalUtil.alsArabischCijfer("C"));
		    Assert.AreEqual(500, GetalUtil.alsArabischCijfer("D"));
		    Assert.AreEqual(1000, GetalUtil.alsArabischCijfer("M"));
	    }
	
	    [TestMethod]
	    public void optellendeRomeinseCijfers() {
		    Assert.AreEqual(2, GetalUtil.alsArabischCijfer("II"));
		    Assert.AreEqual(3, GetalUtil.alsArabischCijfer("III"));
		    Assert.AreEqual(6, GetalUtil.alsArabischCijfer("VI"));
		    Assert.AreEqual(7, GetalUtil.alsArabischCijfer("VII"));
		    Assert.AreEqual(8, GetalUtil.alsArabischCijfer("VIII"));
		    Assert.AreEqual(11, GetalUtil.alsArabischCijfer("XI"));
		    Assert.AreEqual(17, GetalUtil.alsArabischCijfer("XVII"));
		    Assert.AreEqual(38, GetalUtil.alsArabischCijfer("XXXVIII"));
		    Assert.AreEqual(72, GetalUtil.alsArabischCijfer("LXXII"));
		    Assert.AreEqual(80, GetalUtil.alsArabischCijfer("LXXX"));
		    Assert.AreEqual(122, GetalUtil.alsArabischCijfer("CXXII"));
		    Assert.AreEqual(153, GetalUtil.alsArabischCijfer("CLIII"));
		    Assert.AreEqual(678, GetalUtil.alsArabischCijfer("DCLXXVIII"));
		    Assert.AreEqual(1233, GetalUtil.alsArabischCijfer("MCCXXXIII"));
		    Assert.AreEqual(3272, GetalUtil.alsArabischCijfer("MMMCCLXXII"));
	    }

        [TestMethod]
	    public void aftrekkendeRomeinseCijfers() {
		    Assert.AreEqual(4, GetalUtil.alsArabischCijfer("IV"));
		    Assert.AreEqual(9, GetalUtil.alsArabischCijfer("IX"));
		    Assert.AreEqual(39, GetalUtil.alsArabischCijfer("XXXIX"));
		    Assert.AreEqual(42, GetalUtil.alsArabischCijfer("XLII"));
		    Assert.AreEqual(99, GetalUtil.alsArabischCijfer("XCIX"));
		    Assert.AreEqual(109, GetalUtil.alsArabischCijfer("CIX"));
		    Assert.AreEqual(119, GetalUtil.alsArabischCijfer("CXIX"));
		    Assert.AreEqual(129, GetalUtil.alsArabischCijfer("CXXIX"));
		    Assert.AreEqual(139, GetalUtil.alsArabischCijfer("CXXXIX"));
		    Assert.AreEqual(169, GetalUtil.alsArabischCijfer("CLXIX"));
		    Assert.AreEqual(979, GetalUtil.alsArabischCijfer("CMLXXIX"));
		    Assert.AreEqual(1999, GetalUtil.alsArabischCijfer("MCMXCIX"));
	    }
    }
}

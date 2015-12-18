using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using num;

namespace test
{
    [TestClass]
    public class SchrijfInArabischeCijfersTest
    {
        [TestMethod]
        public void schrijfInArabischeCijfers()
        {
            Assert.AreEqual(0, GetalUtil.schrijfInArabischeCijfers(""));
            Assert.AreEqual(1, GetalUtil.schrijfInArabischeCijfers("1"));
            Assert.AreEqual(2, GetalUtil.schrijfInArabischeCijfers("10"));
            Assert.AreEqual(3, GetalUtil.schrijfInArabischeCijfers("11"));
            Assert.AreEqual(4, GetalUtil.schrijfInArabischeCijfers("100"));
            Assert.AreEqual(5, GetalUtil.schrijfInArabischeCijfers("101"));
            Assert.AreEqual(6, GetalUtil.schrijfInArabischeCijfers("110"));
            Assert.AreEqual(7, GetalUtil.schrijfInArabischeCijfers("111"));
            Assert.AreEqual(8, GetalUtil.schrijfInArabischeCijfers("1000"));
            Assert.AreEqual(9, GetalUtil.schrijfInArabischeCijfers("1001"));
            Assert.AreEqual(10, GetalUtil.schrijfInArabischeCijfers("1010"));
            Assert.AreEqual(11, GetalUtil.schrijfInArabischeCijfers("1011"));
            Assert.AreEqual(12, GetalUtil.schrijfInArabischeCijfers("1100"));
            Assert.AreEqual(13, GetalUtil.schrijfInArabischeCijfers("1101"));
            Assert.AreEqual(14, GetalUtil.schrijfInArabischeCijfers("1110"));
            Assert.AreEqual(15, GetalUtil.schrijfInArabischeCijfers("1111"));
            Assert.AreEqual(16, GetalUtil.schrijfInArabischeCijfers("10000"));
            Assert.AreEqual(17, GetalUtil.schrijfInArabischeCijfers("10001"));
            Assert.AreEqual(18, GetalUtil.schrijfInArabischeCijfers("10010"));
            Assert.AreEqual(19, GetalUtil.schrijfInArabischeCijfers("10011"));
            Assert.AreEqual(20, GetalUtil.schrijfInArabischeCijfers("10100"));
            Assert.AreEqual(5679548, GetalUtil.schrijfInArabischeCijfers("10101101010100110111100"));
        }
    }
}

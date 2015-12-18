using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using num;

namespace test
{
    [TestClass]
    public class SchrijfInBinaireCijfersTest
    {
        [TestMethod]
        public void schrijfInBinaireCijfers()
        {
            Assert.AreEqual("", GetalUtil.schrijfInBinaireCijfers(0));
            Assert.AreEqual("1", GetalUtil.schrijfInBinaireCijfers(1));
            Assert.AreEqual("10", GetalUtil.schrijfInBinaireCijfers(2));
            Assert.AreEqual("11", GetalUtil.schrijfInBinaireCijfers(3));
            Assert.AreEqual("100", GetalUtil.schrijfInBinaireCijfers(4));
            Assert.AreEqual("101", GetalUtil.schrijfInBinaireCijfers(5));
            Assert.AreEqual("110", GetalUtil.schrijfInBinaireCijfers(6));
            Assert.AreEqual("111", GetalUtil.schrijfInBinaireCijfers(7));
            Assert.AreEqual("1000", GetalUtil.schrijfInBinaireCijfers(8));
            Assert.AreEqual("1001", GetalUtil.schrijfInBinaireCijfers(9));
            Assert.AreEqual("1010", GetalUtil.schrijfInBinaireCijfers(10));
            Assert.AreEqual("1011", GetalUtil.schrijfInBinaireCijfers(11));
            Assert.AreEqual("1100", GetalUtil.schrijfInBinaireCijfers(12));
            Assert.AreEqual("1101", GetalUtil.schrijfInBinaireCijfers(13));
            Assert.AreEqual("1110", GetalUtil.schrijfInBinaireCijfers(14));
            Assert.AreEqual("1111", GetalUtil.schrijfInBinaireCijfers(15));
            Assert.AreEqual("10000", GetalUtil.schrijfInBinaireCijfers(16));
            Assert.AreEqual("10001", GetalUtil.schrijfInBinaireCijfers(17));
            Assert.AreEqual("10010", GetalUtil.schrijfInBinaireCijfers(18));
            Assert.AreEqual("10011", GetalUtil.schrijfInBinaireCijfers(19));
            Assert.AreEqual("10100", GetalUtil.schrijfInBinaireCijfers(20));
            Assert.AreEqual("10101101010100110111100", GetalUtil.schrijfInBinaireCijfers(5679548));
        }
    }
}

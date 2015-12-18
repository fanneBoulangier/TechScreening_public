using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using faculteit;

namespace test
{
    [TestClass]
    public class FaculteitTest
    {
        [TestMethod]
        public void nultemtwintigFaculteit()
        {
            Assert.AreEqual(1, Faculteit.faculteit(0));
            Assert.AreEqual(1, Faculteit.faculteit(1));
            Assert.AreEqual(2, Faculteit.faculteit(2));
            Assert.AreEqual(6, Faculteit.faculteit(3));
            Assert.AreEqual(24, Faculteit.faculteit(4));
            Assert.AreEqual(120, Faculteit.faculteit(5));
            Assert.AreEqual(720, Faculteit.faculteit(6));
            Assert.AreEqual(5040, Faculteit.faculteit(7));
            Assert.AreEqual(40320, Faculteit.faculteit(8));
            Assert.AreEqual(362880, Faculteit.faculteit(9));
            Assert.AreEqual(3628800, Faculteit.faculteit(10));
            Assert.AreEqual(39916800, Faculteit.faculteit(11));
            Assert.AreEqual(479001600, Faculteit.faculteit(12));
            Assert.AreEqual(6227020800L, Faculteit.faculteit(13));
            Assert.AreEqual(87178291200L, Faculteit.faculteit(14));
            Assert.AreEqual(1307674368000L, Faculteit.faculteit(15));
            Assert.AreEqual(20922789888000L, Faculteit.faculteit(16));
            Assert.AreEqual(355687428096000L, Faculteit.faculteit(17));
            Assert.AreEqual(6402373705728000L, Faculteit.faculteit(18));
            Assert.AreEqual(121645100408832000L, Faculteit.faculteit(19));
            Assert.AreEqual(2432902008176640000L, Faculteit.faculteit(20));
        }
    }
}

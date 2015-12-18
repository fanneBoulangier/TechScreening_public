using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using palindroom;

namespace test
{
    [TestClass]
    public class PalindroomTest
    {
        [TestMethod]
        public void legeStringIsEenPalindroom() {
		    Assert.IsTrue(new Palindroom().isPalindroom(""));
	    }
	
	    [TestMethod]
	    public void eenKarakterStringIsEenPalindroom() {
            Assert.IsTrue(new Palindroom().isPalindroom("a"));
	    }
	
	    [TestMethod]
	    public void palindroom() {
            Assert.IsTrue(new Palindroom().isPalindroom("koortsmeetsysteemstrook"));
	    }

        [TestMethod]
	    public void geenPalindroom() {
            Assert.IsFalse(new Palindroom().isPalindroom("koekoeksklok"));
	    }
    }
}

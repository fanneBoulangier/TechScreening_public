using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using encodering;

namespace test
{
    [TestClass]
    public class LengteEncoderingAlgoritmeTest
    {
        private LengteEncoderingAlgoritme lengteEncodering;

        [TestInitialize]
        public void setup() {
		    lengteEncodering = new LengteEncoderingAlgoritme();
	    }

        [TestMethod]
        public void legeString() {
		    Assert.AreEqual("", lengteEncodering.encodeer(""));
	    }

	    [TestMethod]
	    public void geenEncoderingNodig() {
		    Assert.AreEqual("abc", lengteEncodering.encodeer("abc"));
	    }

	    [TestMethod]
	    public void encodeerVolledigeString() {
		    Assert.AreEqual("3a", lengteEncodering.encodeer("aaa"));
	    }

	    [TestMethod]
	    public void encodeerEersteLetters() {
		    Assert.AreEqual("3abc", lengteEncodering.encodeer("aaabc"));
	    }

	    [TestMethod]
	    public void encodeerLettersInMidden() {
		    Assert.AreEqual("a4bc", lengteEncodering.encodeer("abbbbc"));
	    }

	    [TestMethod]
	    public void encodeerLettersOpEinde() {
		    Assert.AreEqual("ab2c", lengteEncodering.encodeer("abcc"));
	    }

	    [TestMethod]
	    public void meerdereAaneenschakelingenVanHetzelfdeKarakter() {
		    Assert.AreEqual("4ab2ac5a", lengteEncodering.encodeer("aaaabaacaaaaa"));
	    }

        [TestMethod]
	    public void meerdereAaneenschakelingenVanVerschillendeKarakters() {
		    Assert.AreEqual("4ab3c", lengteEncodering.encodeer("aaaabccc"));
	    }
    }
}

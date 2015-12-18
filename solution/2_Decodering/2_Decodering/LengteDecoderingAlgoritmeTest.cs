using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using decodering;

namespace test
{
    [TestClass]
    public class LengteDecoderingAlgoritmeTest
    {
        private LengteDecoderingAlgoritme lengteDecodering;

        [TestInitialize]
        public void setup() {
		    lengteDecodering = new LengteDecoderingAlgoritme();
	    }

        [TestMethod]
        public void legeString() {
		    Assert.AreEqual("", lengteDecodering.decodeer(""));
	    }

	    [TestMethod]
	    public void geenDecoderingNodig() {
		    Assert.AreEqual("abc", lengteDecodering.decodeer("abc"));
	    }

	    [TestMethod]
	    public void decodeerVolledigeString() {
		    Assert.AreEqual("aaa", lengteDecodering.decodeer("3a"));
	    }

	    [TestMethod]
	    public void decodeerEersteLetters() {
		    Assert.AreEqual("aaabc", lengteDecodering.decodeer("3abc"));
	    }

	    [TestMethod]
	    public void decodeerLettersInMidden() {
		    Assert.AreEqual("abbbbc", lengteDecodering.decodeer("a4bc"));
	    }

	    [TestMethod]
	    public void decodeerLettersOpEinde() {
		    Assert.AreEqual("abcc", lengteDecodering.decodeer("ab2c"));
	    }

        [TestMethod]
	    public void meerdereAaneenschakelingenVanHetzelfdeKarakter() {
		    Assert.AreEqual("aaaabaaaaaaaaaaaaaacaaaaa", lengteDecodering.decodeer("4ab14ac5a"));
	    }
    }
}

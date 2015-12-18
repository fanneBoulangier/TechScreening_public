using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using getalvoluit;

namespace test
{
    [TestClass]
    public class GetalVoluitTest
    {
        [TestMethod]
        public void nultem20() {
		    Assert.AreEqual("nul", roepvoluit(0));
		    Assert.AreEqual("één", roepvoluit(1));
		    Assert.AreEqual("twee", roepvoluit(2));
		    Assert.AreEqual("drie", roepvoluit(3));
		    Assert.AreEqual("vier", roepvoluit(4));
		    Assert.AreEqual("vijf", roepvoluit(5));
		    Assert.AreEqual("zes", roepvoluit(6));
		    Assert.AreEqual("zeven", roepvoluit(7));
		    Assert.AreEqual("acht", roepvoluit(8));
		    Assert.AreEqual("negen", roepvoluit(9));
		    Assert.AreEqual("tien", roepvoluit(10));
		    Assert.AreEqual("elf", roepvoluit(11));
		    Assert.AreEqual("twaalf", roepvoluit(12));
		    Assert.AreEqual("dertien", roepvoluit(13));
		    Assert.AreEqual("veertien", roepvoluit(14));
		    Assert.AreEqual("vijftien", roepvoluit(15));
		    Assert.AreEqual("zestien", roepvoluit(16));
		    Assert.AreEqual("zeventien", roepvoluit(17));
		    Assert.AreEqual("achttien", roepvoluit(18));
		    Assert.AreEqual("negentien", roepvoluit(19));
		    Assert.AreEqual("twintig", roepvoluit(20));
	    }
	
	    [TestMethod]
	    public void twintigTallen() {
		    Assert.AreEqual("één en twintig", roepvoluit(21));
		    Assert.AreEqual("twee en twintig", roepvoluit(22));
		    Assert.AreEqual("drie en twintig", roepvoluit(23));
		    Assert.AreEqual("vier en twintig", roepvoluit(24));
		    Assert.AreEqual("vijf en twintig", roepvoluit(25));
		    Assert.AreEqual("zes en twintig", roepvoluit(26));
		    Assert.AreEqual("zeven en twintig", roepvoluit(27));
		    Assert.AreEqual("acht en twintig", roepvoluit(28));
		    Assert.AreEqual("negen en twintig", roepvoluit(29));
	    }
	
	    [TestMethod]
	    public void dertigTallen() {
		    Assert.AreEqual("dertig", roepvoluit(30));
		    Assert.AreEqual("één en dertig", roepvoluit(31));
		    Assert.AreEqual("twee en dertig", roepvoluit(32));
		    Assert.AreEqual("drie en dertig", roepvoluit(33));
		    Assert.AreEqual("vier en dertig", roepvoluit(34));
		    Assert.AreEqual("vijf en dertig", roepvoluit(35));
		    Assert.AreEqual("zes en dertig", roepvoluit(36));
		    Assert.AreEqual("zeven en dertig", roepvoluit(37));
		    Assert.AreEqual("acht en dertig", roepvoluit(38));
		    Assert.AreEqual("negen en dertig", roepvoluit(39));
	    }
	
	    [TestMethod]
	    public void resterendeTemHonderd() {
		    Assert.AreEqual("veertig", roepvoluit(40));
		    Assert.AreEqual("één en veertig", roepvoluit(41));
		    Assert.AreEqual("twee en vijftig", roepvoluit(52));
		    Assert.AreEqual("drie en zestig", roepvoluit(63));
		    Assert.AreEqual("vier en zeventig", roepvoluit(74));
		    Assert.AreEqual("vijf en tachtig", roepvoluit(85));
		    Assert.AreEqual("zes en negentig", roepvoluit(96));
		    Assert.AreEqual("negen en negentig", roepvoluit(99));
		    Assert.AreEqual("honderd", roepvoluit(100));
	    }
	
	    [TestMethod]
	    public void honderdtemDuizend() {
		    Assert.AreEqual("honderd en één", roepvoluit(101));
		    Assert.AreEqual("honderd en tien", roepvoluit(110));
		    Assert.AreEqual("honderd en zes en tachtig", roepvoluit(186));
		    Assert.AreEqual("twee honderd", roepvoluit(200));
		    Assert.AreEqual("twee honderd en vijftig", roepvoluit(250));
		    Assert.AreEqual("drie honderd en twee en veertig", roepvoluit(342));
		    Assert.AreEqual("vijf honderd en dertien", roepvoluit(513));
		    Assert.AreEqual("negen honderd en twaalf", roepvoluit(912));
		    Assert.AreEqual("negen honderd en negen en negentig", roepvoluit(999));
		    Assert.AreEqual("duizend", roepvoluit(1000));
	    }

        [TestMethod]
	    public void duizendTemMiljoen() {
		    Assert.AreEqual("duizend en honderd en twee en veertig", roepvoluit(1142));
		    Assert.AreEqual("drie duizend en vijf honderd en twee", roepvoluit(3502));
		    Assert.AreEqual("tien duizend en drie honderd en twaalf", roepvoluit(10312));
		    Assert.AreEqual("vijftien duizend en twee honderd en drie en zestig", roepvoluit(15263));
		    Assert.AreEqual("honderd en twaalf duizend en zes honderd en drie", roepvoluit(112603));
		    Assert.AreEqual("drie honderd en vijf en dertig duizend en zes honderd en drie", roepvoluit(335603));
		    Assert.AreEqual("zes honderd en twee en twintig duizend en twee honderd en vier en zestig", roepvoluit(622264));
		    Assert.AreEqual("miljoen", roepvoluit(1000000));
	    }
	

	    private String roepvoluit(int getal) {
		    return new GetalVoluit().roepvoluit(getal);
	    }
    }
}

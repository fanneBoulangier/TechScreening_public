package getalvoluit;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class GetalVoluitTest {
	
	@Test
	public void nultem20() {
		assertEquals("nul", roepvoluit(0));
		assertEquals("één", roepvoluit(1));
		assertEquals("twee", roepvoluit(2));
		assertEquals("drie", roepvoluit(3));
		assertEquals("vier", roepvoluit(4));
		assertEquals("vijf", roepvoluit(5));
		assertEquals("zes", roepvoluit(6));
		assertEquals("zeven", roepvoluit(7));
		assertEquals("acht", roepvoluit(8));
		assertEquals("negen", roepvoluit(9));
		assertEquals("tien", roepvoluit(10));
		assertEquals("elf", roepvoluit(11));
		assertEquals("twaalf", roepvoluit(12));
		assertEquals("dertien", roepvoluit(13));
		assertEquals("veertien", roepvoluit(14));
		assertEquals("vijftien", roepvoluit(15));
		assertEquals("zestien", roepvoluit(16));
		assertEquals("zeventien", roepvoluit(17));
		assertEquals("achttien", roepvoluit(18));
		assertEquals("negentien", roepvoluit(19));
		assertEquals("twintig", roepvoluit(20));
	}
	
	@Test
	public void twintigTallen() {
		assertEquals("één en twintig", roepvoluit(21));
		assertEquals("twee en twintig", roepvoluit(22));
		assertEquals("drie en twintig", roepvoluit(23));
		assertEquals("vier en twintig", roepvoluit(24));
		assertEquals("vijf en twintig", roepvoluit(25));
		assertEquals("zes en twintig", roepvoluit(26));
		assertEquals("zeven en twintig", roepvoluit(27));
		assertEquals("acht en twintig", roepvoluit(28));
		assertEquals("negen en twintig", roepvoluit(29));
	}
	
	@Test
	public void dertigTallen() {
		assertEquals("dertig", roepvoluit(30));
		assertEquals("één en dertig", roepvoluit(31));
		assertEquals("twee en dertig", roepvoluit(32));
		assertEquals("drie en dertig", roepvoluit(33));
		assertEquals("vier en dertig", roepvoluit(34));
		assertEquals("vijf en dertig", roepvoluit(35));
		assertEquals("zes en dertig", roepvoluit(36));
		assertEquals("zeven en dertig", roepvoluit(37));
		assertEquals("acht en dertig", roepvoluit(38));
		assertEquals("negen en dertig", roepvoluit(39));
	}
	
	@Test
	public void resterendeTemHonderd() {
		assertEquals("veertig", roepvoluit(40));
		assertEquals("één en veertig", roepvoluit(41));
		assertEquals("twee en vijftig", roepvoluit(52));
		assertEquals("drie en zestig", roepvoluit(63));
		assertEquals("vier en zeventig", roepvoluit(74));
		assertEquals("vijf en tachtig", roepvoluit(85));
		assertEquals("zes en negentig", roepvoluit(96));
		assertEquals("negen en negentig", roepvoluit(99));
		assertEquals("honderd", roepvoluit(100));
	}
	
	@Test
	public void honderdtemDuizend() {
		assertEquals("honderd en één", roepvoluit(101));
		assertEquals("honderd en tien", roepvoluit(110));
		assertEquals("honderd en zes en tachtig", roepvoluit(186));
		assertEquals("twee honderd", roepvoluit(200));
		assertEquals("twee honderd en vijftig", roepvoluit(250));
		assertEquals("drie honderd en twee en veertig", roepvoluit(342));
		assertEquals("vijf honderd en dertien", roepvoluit(513));
		assertEquals("negen honderd en twaalf", roepvoluit(912));
		assertEquals("negen honderd en negen en negentig", roepvoluit(999));
		assertEquals("duizend", roepvoluit(1000));
	}
	
	@Test
	public void duizendTemMiljoen() {
		assertEquals("duizend en honderd en twee en veertig", roepvoluit(1142));
		assertEquals("drie duizend en vijf honderd en twee", roepvoluit(3502));
		assertEquals("tien duizend en drie honderd en twaalf", roepvoluit(10312));
		assertEquals("vijftien duizend en twee honderd en drie en zestig", roepvoluit(15263));
		assertEquals("honderd en twaalf duizend en zes honderd en drie", roepvoluit(112603));
		assertEquals("drie honderd en vijf en dertig duizend en zes honderd en drie", roepvoluit(335603));
		assertEquals("zes honderd en twee en twintig duizend en twee honderd en vier en zestig", roepvoluit(622264));
		assertEquals("miljoen", roepvoluit(1000000));
	}
	

	private String roepvoluit(int getal) {
		return new GetalVoluit().roepvoluit(getal);
	}

}

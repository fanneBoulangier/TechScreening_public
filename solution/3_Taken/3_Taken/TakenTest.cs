using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using taken;

namespace test
{
    [TestClass]
    public class TakenTest
    {
        [TestMethod]
        public void takenVanTypeOplossingVoorDatum_geeftEnkelTakenTerugVanVoorBepaaldeDatum() {
		    Taken taken = new Taken();
		    Taak taakEergisterenGestart = new Taak();
		    taakEergisterenGestart.setType(TaakType.HONDEN_VOEDEREN);
		    taakEergisterenGestart.setOmschrijving("voeder de honden, vergeet het water niet");
		    taakEergisterenGestart.setOplossing(new Periode(eergisteren(), null));

		    Taak taakGisterenGestart = new Taak();
		    taakGisterenGestart.setType(TaakType.HONDEN_VOEDEREN);
		    taakGisterenGestart.setOmschrijving("voeder de honden, vergeet het water niet");
		    taakGisterenGestart.setOplossing(new Periode(gisteren(), null));

		    Taak taakVandaagGestart = new Taak();
		    taakVandaagGestart.setType(TaakType.HONDEN_VOEDEREN);
		    taakVandaagGestart.setOmschrijving("voeder de honden, vergeet het water niet");
		    taakVandaagGestart.setOplossing(new Periode(vandaag(), null));

		    Taak taakNietGestart = new Taak();
		    taakNietGestart.setType(TaakType.HONDEN_VOEDEREN);
		    taakNietGestart.setOmschrijving("voeder de honden, vergeet het water niet");
		    taakNietGestart.setOplossing(null);

		    taken.getTaken().Add(taakEergisterenGestart);
            taken.getTaken().Add(taakGisterenGestart);
            taken.getTaken().Add(taakVandaagGestart);
            taken.getTaken().Add(taakNietGestart);

		    HashSet<Taak> result = taken.geefTakenVanTypeOplossingGestartVoor(TaakType.HONDEN_VOEDEREN, gisteren());

            HashSet<Taak> expected = new HashSet<Taak>();
            expected.Add(taakEergisterenGestart);
            setAssertEquals(expected, result);
	    }

	    [TestMethod]
	    public void takenVanTypeOplossingVoorDatum_geeftEnkelTakenTerugVanCorrectType() {
		    Taken taken = new Taken();
		    Taak taakCorrectType = new Taak();
		    taakCorrectType.setType(TaakType.HONDEN_VOEDEREN);
		    taakCorrectType
				    .setOmschrijving("voeder de honden, vergeet het water niet");
		    taakCorrectType.setOplossing(new Periode(eergisteren(), null));

		    Taak taakVerkeerdType = new Taak();
		    taakVerkeerdType.setType(TaakType.MAAI_GRAS);
		    taakVerkeerdType.setOmschrijving("maai het gras, niet te laag");
		    taakVerkeerdType.setOplossing(new Periode(eergisteren(), null));

		    taken.getTaken().Add(taakCorrectType);
		    taken.getTaken().Add(taakVerkeerdType);

		    HashSet<Taak> result = taken.geefTakenVanTypeOplossingGestartVoor(TaakType.HONDEN_VOEDEREN, gisteren());

            HashSet<Taak> expected = new HashSet<Taak>();
            expected.Add(taakCorrectType);
            setAssertEquals(expected, result);
	    }

	    [TestMethod]
	    public void takenVanTypeGesorteerdVolgensOplossingsTermijn_geeftGesorteerdeOpgelosteTakenTerug() {
		    Taken taken = new Taken();
		    Taak korteoplossingstermijn = new Taak();
		    korteoplossingstermijn.setType(TaakType.HONDEN_VOEDEREN);
		    korteoplossingstermijn
				    .setOmschrijving("voeder de honden, vergeet het water niet");
		    korteoplossingstermijn.setOplossing(new Periode(eergisteren(),
				    gisteren()));

		    Taak middellangeoplossingstermijn = new Taak();
		    middellangeoplossingstermijn.setType(TaakType.HONDEN_VOEDEREN);
		    middellangeoplossingstermijn
				    .setOmschrijving("voeder de honden, vergeet het water niet");
		    middellangeoplossingstermijn.setOplossing(new Periode(vorigeweek(),
				    gisteren()));

		    Taak langeoplossingstermijn = new Taak();
		    langeoplossingstermijn.setType(TaakType.HONDEN_VOEDEREN);
		    langeoplossingstermijn
				    .setOmschrijving("voeder de honden, vergeet het water niet");
		    langeoplossingstermijn.setOplossing(new Periode(vorigemaand(),
				    vandaag()));

		    Taak taakbegonnenmaarnognietopgelost = new Taak();
		    taakbegonnenmaarnognietopgelost.setType(TaakType.HONDEN_VOEDEREN);
		    taakbegonnenmaarnognietopgelost
				    .setOmschrijving("voeder de honden, vergeet het water niet");
		    taakbegonnenmaarnognietopgelost.setOplossing(new Periode(eergisteren(),
				    null));

		    Taak taaknognietbegonnen = new Taak();
		    taaknognietbegonnen.setType(TaakType.HONDEN_VOEDEREN);
		    taaknognietbegonnen
				    .setOmschrijving("voeder de honden, vergeet het water niet");
		    taaknognietbegonnen.setOplossing(null);

		    taken.getTaken().Add(korteoplossingstermijn);
		    taken.getTaken().Add(middellangeoplossingstermijn);
		    taken.getTaken().Add(langeoplossingstermijn);
		    taken.getTaken().Add(taakbegonnenmaarnognietopgelost);
		    taken.getTaken().Add(taaknognietbegonnen);

		    List<Taak> result = taken.geefOpgelosteTakenVanTypeGesorteerdVolgensOplossingsTermijn(TaakType.HONDEN_VOEDEREN);
		    List<Taak> expected = new List<Taak>();
		    expected.Add(korteoplossingstermijn);
		    expected.Add(middellangeoplossingstermijn);
		    expected.Add(langeoplossingstermijn);
		    CollectionAssert.AreEqual(expected, result);
	    }

	    [TestMethod]
	    public void takenVanTypeGesorteerdVolgensOplossingsTermijn_geeftEnkelTakenVanCorrectTypeTerug() {
		    Taken taken = new Taken();
		    Taak taakVanCorrectType = new Taak();
		    taakVanCorrectType.setType(TaakType.HONDEN_VOEDEREN);
		    taakVanCorrectType
				    .setOmschrijving("voeder de honden, vergeet het water niet");
		    taakVanCorrectType.setOplossing(new Periode(eergisteren(), gisteren()));

		    Taak taakVanIncorrectType = new Taak();
		    taakVanIncorrectType.setType(TaakType.KAM_KAT);
		    taakVanIncorrectType.setOmschrijving("kam de kat");
		    taakVanIncorrectType
				    .setOplossing(new Periode(vorigeweek(), gisteren()));

		    taken.getTaken().Add(taakVanCorrectType);
		    taken.getTaken().Add(taakVanIncorrectType);

		    List<Taak> result = taken.geefOpgelosteTakenVanTypeGesorteerdVolgensOplossingsTermijn(TaakType.HONDEN_VOEDEREN);

            List<Taak> expected = new List<Taak>();
            expected.Add(taakVanCorrectType);
		    CollectionAssert.AreEqual(expected, result);
	    }
	
	    [TestMethod]
	    public void gestarteTakenVanType_geeftEnkelTakenDieGestartZijnTerug() {
		    Taken taken = new Taken();
		    Taak gestarteTaak = new Taak();
		    gestarteTaak.setType(TaakType.HONDEN_VOEDEREN);
		    gestarteTaak.setOmschrijving("voeder de honden, vergeet het water niet");
		    gestarteTaak.setOplossing(new Periode(gisteren(), null));
		
		    Taak opgelosteTaak = new Taak();
		    opgelosteTaak.setType(TaakType.HONDEN_VOEDEREN);
		    opgelosteTaak.setOmschrijving("voeder de honden, vergeet het water niet");
		    opgelosteTaak.setOplossing(new Periode(gisteren(), vandaag()));
		
		    Taak teStartenTaak = new Taak();
		    teStartenTaak.setType(TaakType.HONDEN_VOEDEREN);
		    teStartenTaak.setOmschrijving("voeder de honden, vergeet het water niet");
		    teStartenTaak.setOplossing(null);
		
		    taken.getTaken().Add(gestarteTaak);
		    taken.getTaken().Add(opgelosteTaak);
		    taken.getTaken().Add(teStartenTaak);
		
		    HashSet<Taak> result = taken.getGestarteTakenVanType(TaakType.HONDEN_VOEDEREN);
		    HashSet<Taak> expected = new HashSet<Taak>();
		    expected.Add(gestarteTaak);
		    expected.Add(opgelosteTaak);
		
		    setAssertEquals(expected, result);
	    }

        [TestMethod]
	    public void gestarteTakenVanType_geeftEnkelTakenVanCorrectTypeTerug() {
		    Taken taken = new Taken();
		    Taak taakVanCorrectType = new Taak();
		    taakVanCorrectType.setType(TaakType.HONDEN_VOEDEREN);
		    taakVanCorrectType.setOmschrijving("voeder de honden, vergeet het water niet");
		    taakVanCorrectType.setOplossing(new Periode(gisteren(), null));
		
		    Taak taakVanIncorrectType = new Taak();
		    taakVanIncorrectType.setType(TaakType.SCHEER_HAAG);
		    taakVanIncorrectType.setOmschrijving("Scheer de haag, kuis alle takken op en probeer deze te hakselen");
		    taakVanIncorrectType.setOplossing(new Periode(gisteren(), null));
		
		    taken.getTaken().Add(taakVanCorrectType);
		    taken.getTaken().Add(taakVanIncorrectType);
		
		    HashSet<Taak> result = taken.getGestarteTakenVanType(TaakType.HONDEN_VOEDEREN);

            HashSet<Taak> expected = new HashSet<Taak>();
            expected.Add(taakVanCorrectType);
		    setAssertEquals(expected, result);
	    }

	    private DateTime vorigemaand() {
            return DateTime.Today.AddMonths(-1);
	    }

        private DateTime vorigeweek()
        {
            return DateTime.Today.AddDays(-7);
	    }

        private DateTime eergisteren()
        {
            return DateTime.Today.AddDays(-2);
	    }

        private DateTime gisteren()
        {
            return DateTime.Today.AddDays(-1);
	    }

        private DateTime vandaag()
        {
            return DateTime.Today;
	    }

        private void setAssertEquals(HashSet<Taak> expected, HashSet<Taak> actual){
            foreach (Taak taak in expected)
            {
                Assert.IsTrue(actual.Contains(taak));
            }
        }
    }
}

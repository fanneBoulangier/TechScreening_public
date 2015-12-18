package taken;

import static java.util.Collections.singleton;
import static java.util.Collections.singletonList;
import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

//zie leesmij.txt
public class TakenTest {

	@Test
	public void takenVanTypeOplossingVoorDatum_geeftEnkelTakenTerugVanVoorBepaaldeDatum() {
		Taken taken = new Taken();
		Taak taakEergisterenGestart = new Taak();
		taakEergisterenGestart.setType(TaakType.HONDEN_VOEDEREN);
		taakEergisterenGestart
				.setOmschrijving("voeder de honden, vergeet het water niet");
		taakEergisterenGestart.setOplossing(new Periode(eergisteren(), null));

		Taak taakGisterenGestart = new Taak();
		taakGisterenGestart.setType(TaakType.HONDEN_VOEDEREN);
		taakGisterenGestart
				.setOmschrijving("voeder de honden, vergeet het water niet");
		taakGisterenGestart.setOplossing(new Periode(gisteren(), null));

		Taak taakVandaagGestart = new Taak();
		taakVandaagGestart.setType(TaakType.HONDEN_VOEDEREN);
		taakVandaagGestart
				.setOmschrijving("voeder de honden, vergeet het water niet");
		taakVandaagGestart.setOplossing(new Periode(vandaag(), null));

		Taak taakNietGestart = new Taak();
		taakNietGestart.setType(TaakType.HONDEN_VOEDEREN);
		taakNietGestart
				.setOmschrijving("voeder de honden, vergeet het water niet");
		taakNietGestart.setOplossing(null);

		taken.getTaken().add(taakEergisterenGestart);
		taken.getTaken().add(taakGisterenGestart);
		taken.getTaken().add(taakVandaagGestart);
		taken.getTaken().add(taakNietGestart);

		Set<Taak> result = taken.geefTakenVanTypeOplossingGestartVoor(
				TaakType.HONDEN_VOEDEREN, gisteren());
		assertEquals(Collections.singleton(taakEergisterenGestart), result);
	}

	@Test
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

		taken.getTaken().add(taakCorrectType);
		taken.getTaken().add(taakVerkeerdType);

		Set<Taak> result = taken.geefTakenVanTypeOplossingGestartVoor(
				TaakType.HONDEN_VOEDEREN, gisteren());
		assertEquals(Collections.singleton(taakCorrectType), result);
	}

	@Test
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

		taken.getTaken().add(korteoplossingstermijn);
		taken.getTaken().add(middellangeoplossingstermijn);
		taken.getTaken().add(langeoplossingstermijn);
		taken.getTaken().add(taakbegonnenmaarnognietopgelost);
		taken.getTaken().add(taaknognietbegonnen);

		List<Taak> result = taken
				.geefOpgelosteTakenVanTypeGesorteerdVolgensOplossingsTermijn(TaakType.HONDEN_VOEDEREN);
		List<Taak> expected = new ArrayList<Taak>();
		expected.add(korteoplossingstermijn);
		expected.add(middellangeoplossingstermijn);
		expected.add(langeoplossingstermijn);
		assertEquals(expected, result);
	}

	@Test
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

		taken.getTaken().add(taakVanCorrectType);
		taken.getTaken().add(taakVanIncorrectType);

		List<Taak> result = taken
				.geefOpgelosteTakenVanTypeGesorteerdVolgensOplossingsTermijn(TaakType.HONDEN_VOEDEREN);
		assertEquals(singletonList(taakVanCorrectType), result);
	}
	
	@Test
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
		
		taken.getTaken().add(gestarteTaak);
		taken.getTaken().add(opgelosteTaak);
		taken.getTaken().add(teStartenTaak);
		
		Set<Taak> result = taken.getGestarteTakenVanType(TaakType.HONDEN_VOEDEREN);
		Set<Taak> expected = new HashSet<Taak>();
		expected.add(gestarteTaak);
		expected.add(opgelosteTaak);
		
		assertEquals(expected, result);
	}
	
	@Test
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
		
		taken.getTaken().add(taakVanCorrectType);
		taken.getTaken().add(taakVanIncorrectType);
		
		Set<Taak> result = taken.getGestarteTakenVanType(TaakType.HONDEN_VOEDEREN);
		assertEquals(singleton(taakVanCorrectType), result);
	}

	private Date vorigemaand() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(vandaag());
		calendar.add(Calendar.MONTH, -1);
		return new Date(calendar.getTimeInMillis());
	}

	private Date vorigeweek() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(vandaag());
		calendar.add(Calendar.DAY_OF_MONTH, -7);
		return new Date(calendar.getTimeInMillis());
	}

	private Date eergisteren() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(vandaag());
		calendar.add(Calendar.DAY_OF_MONTH, -2);
		return new Date(calendar.getTimeInMillis());
	}

	private Date gisteren() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(vandaag());
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		return new Date(calendar.getTimeInMillis());
	}

	private Date vandaag() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new Date(calendar.getTimeInMillis());
	}

}

package lists;

import static junit.framework.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class FilterableArrayListTest {
	
	@Test
	public void filterFiltertAlleElementenUitLijstDieMatchen() {
		FilterableList<Long> filterableList = new FilterableArrayList<Long>();
		filterableList.add(1L);
		filterableList.add(4L);
		filterableList.add(14L);
		filterableList.add(15L);
		filterableList.add(16L);
		filterableList.add(17L);
		
		List<Long> result = filterableList.filter(new GroterDan15FilterPredicate());
		assertEquals(2, result.size());
		assertEquals((Long)16L, result.get(0));
		assertEquals((Long)17L, result.get(1));
	}
	
	@Test
	public void erIsGeenConnectieTussenGefilterdeLijstEnOrigineleLijst() {
		FilterableList<Long> filterableList = new FilterableArrayList<Long>();
		filterableList.add(15L);
		filterableList.add(16L);
		filterableList.add(17L);
		
		List<Long> result = filterableList.filter(new GroterDan15FilterPredicate());
		
		filterableList.add(18L);
		
		assertEquals(2, result.size());
		assertEquals((Long)16L, result.get(0));
		assertEquals((Long)17L, result.get(1));
	}

	private class GroterDan15FilterPredicate implements FilterPredicate<Long> {

		@Override
		public boolean matches(Long aLong) {
			return aLong.longValue() > 15L;
		}
		
	}
}

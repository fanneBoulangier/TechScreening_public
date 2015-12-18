package permutaties;

import static java.util.Arrays.asList;
import static java.util.Collections.singleton;
import static java.util.Collections.singletonList;
import static junit.framework.Assert.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;


public class PermutatiesTest {
	
	@Test
	public void legeSet() {
		assertEquals(new HashSet<List<Integer>>(), ListUtil.permuteer(new HashSet<Integer>()));
	}
	
	@Test
	public void setMetEenElement() {
		assertEquals(singleton(singletonList(1)), ListUtil.permuteer(asSet(1)));
	}
	
	@Test
	public void setMetTweeElementen() {
		Set<List<Integer>> expected = new HashSet<List<Integer>>();
		expected.add(asList(1, 2));
		expected.add(asList(2, 1));
		assertEquals(expected, ListUtil.permuteer(asSet(1, 2)));
	}
	
	@Test
	public void setMetDrieElementen() {
		Set<List<Integer>> expected = new HashSet<List<Integer>>();
		expected.add(asList(1, 2, 3));
		expected.add(asList(1, 3, 2));
		expected.add(asList(2, 1, 3));
		expected.add(asList(2, 3, 1));
		expected.add(asList(3, 1, 2));
		expected.add(asList(3, 2, 1));
		assertEquals(expected, ListUtil.permuteer(asSet(1, 2, 3)));
	}
	
	@Test
	public void setMetVierElementen() {
		Set<List<Integer>> expected = new HashSet<List<Integer>>();
		expected.add(asList(1, 2, 3, 4));
		expected.add(asList(1, 2, 4, 3));
		expected.add(asList(1, 3, 2, 4));
		expected.add(asList(1, 3, 4, 2));
		expected.add(asList(1, 4, 2, 3));
		expected.add(asList(1, 4, 3, 2));
		expected.add(asList(2, 1, 3, 4));
		expected.add(asList(2, 1, 4, 3));
		expected.add(asList(2, 3, 1, 4));
		expected.add(asList(2, 3, 4, 1));
		expected.add(asList(2, 4, 1, 3));
		expected.add(asList(2, 4, 3, 1));
		expected.add(asList(3, 1, 2, 4));
		expected.add(asList(3, 1, 4, 2));
		expected.add(asList(3, 2, 1, 4));
		expected.add(asList(3, 2, 4, 1));
		expected.add(asList(3, 4, 1, 2));
		expected.add(asList(3, 4, 2, 1));
		expected.add(asList(4, 1, 2, 3));
		expected.add(asList(4, 1, 3, 2));
		expected.add(asList(4, 2, 1, 3));
		expected.add(asList(4, 2, 3, 1));
		expected.add(asList(4, 3, 1, 2));
		expected.add(asList(4, 3, 2, 1));
		assertEquals(expected, ListUtil.permuteer(asSet(1, 2, 3, 4)));
	}

	private Set<Integer> asSet(Integer... integers) {
		Set<Integer> result = new HashSet<Integer>();
		for (Integer integer : integers) {
			result.add(integer);
		}
		return result;
	}

	
}

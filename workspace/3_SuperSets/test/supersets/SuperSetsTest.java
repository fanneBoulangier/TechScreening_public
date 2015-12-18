package supersets;

import static junit.framework.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class SuperSetsTest {
	
	@Test
	public void superSetsOfEmptySet() {
		assertEquals(new HashSet<Set<Integer>>(), SetUtil.superSets(new HashSet<Integer>()));
	}
	
	@Test
	public void superSetsOfSingleElement() {
		Set<Set<Integer>> expected = new HashSet<Set<Integer>>();
		expected.add(setWithElements());
		expected.add(setWithElements(1));
		assertEquals(expected, SetUtil.superSets(setWithElements(1)));
	}
	
	@Test
	public void superSetsOfSimpleSet() {
		Set<Set<Integer>> expected = new HashSet<Set<Integer>>();
		expected.add(setWithElements());
		expected.add(setWithElements(1));
		expected.add(setWithElements(2));
		expected.add(setWithElements(1, 2));
		assertEquals(expected, SetUtil.superSets(setWithElements(1, 2)));
	}
	
	@Test
	public void superSetsOfBiggerSet() {
		Set<Set<Integer>> expected = new HashSet<Set<Integer>>();
		expected.add(setWithElements());
		expected.add(setWithElements(1));
		expected.add(setWithElements(2));
		expected.add(setWithElements(3));
		expected.add(setWithElements(1, 2));
		expected.add(setWithElements(1, 3));
		expected.add(setWithElements(2, 3));
		expected.add(setWithElements(1, 2, 3));
		
		assertEquals(expected, SetUtil.superSets(setWithElements(1, 2, 3)));
	}
	@Test
	public void superSetsOfEvenBiggerSet() {
		Set<Set<Integer>> expected = new HashSet<Set<Integer>>();
		expected.add(setWithElements());
		expected.add(setWithElements(1));
		expected.add(setWithElements(2));
		expected.add(setWithElements(3));
		expected.add(setWithElements(4));
		expected.add(setWithElements(1, 2));
		expected.add(setWithElements(1, 3));
		expected.add(setWithElements(1, 4));
		expected.add(setWithElements(2, 3));
		expected.add(setWithElements(2, 4));
		expected.add(setWithElements(3, 4));
		expected.add(setWithElements(1, 2, 3));
		expected.add(setWithElements(1, 2, 4));
		expected.add(setWithElements(1, 3, 4));
		expected.add(setWithElements(2, 3, 4));
		expected.add(setWithElements(1, 2, 3, 4));
		
		assertEquals(expected, SetUtil.superSets(setWithElements(1, 2, 3, 4)));
	}
	
	private Set<Integer> setWithElements(Integer... elements) {
		Set<Integer> result = new HashSet<Integer>();
		for (Integer integer : elements) {
			result.add(integer);
		}
		return result;
	}


}

package supersets;

import java.util.Set;

public class SetUtil {

	/**
	 * Supersets geeft van de gegeven set integers een set terug met de mogelijke combinaties van elk van de elementen. De volgorde van 
	 * het resultaat is hierbij niet belangrijk.
	 * 
	 * bvb (1 2 3) => (() (1) (2) (3) (1 2) (1 3) (2 3) (1 2 3))
	 * 
	 * @param set de set om de powerset van te berekenen
	 * @return powerset man de gegeven set
	 */
	public static Set<Set<Integer>> superSets(Set<Integer> set) {
		throw new UnsupportedOperationException("Implement me!");
	}

}

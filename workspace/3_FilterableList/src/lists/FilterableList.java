package lists;

import java.util.List;

/**
 * A list that can be filtered.
 *
 */
public interface FilterableList<T> extends List<T> {
	
	List<T> filter(FilterPredicate<T> filterPredicate);

}

package lists;

import java.util.List;

/**
 * Een filterable lijst is een lijst waarop je kan filteren
 *
 */
public interface FilterableList<T> extends List<T> {
	
	List<T> filter(FilterPredicate<T> filterPredicate);

}

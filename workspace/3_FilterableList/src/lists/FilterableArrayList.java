package lists;

import java.util.ArrayList;
import java.util.List;

public class FilterableArrayList<T> extends ArrayList<T> implements
		FilterableList<T> {

	private static final long serialVersionUID = 885116575013912295L;

	/**
	 * Filters the elements out of this list using the given filterPredicate and returns
	 * the filtered list.
	 * This method always returns a new list, having no connection to the original list.
	 */
	@Override
	public List<T> filter(FilterPredicate<T> filterPredicate) {
		throw new UnsupportedOperationException("implement me");
	}

}

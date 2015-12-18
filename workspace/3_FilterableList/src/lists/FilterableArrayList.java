package lists;

import java.util.ArrayList;
import java.util.List;

public class FilterableArrayList<T> extends ArrayList<T> implements
		FilterableList<T> {

	private static final long serialVersionUID = 885116575013912295L;

	/**
	 * Filtert de elementen uit de lijst gegeven de filterPredicate en
	 * geeft de gefilterde lijst terug. Deze methode geeft telkens 
	 * een nieuwe gefilterde lijst terug. Er is geen connectie meer 
	 * met de originele lijst.
	 */
	@Override
	public List<T> filter(FilterPredicate<T> filterPredicate) {
		throw new UnsupportedOperationException("implement me");
	}

}

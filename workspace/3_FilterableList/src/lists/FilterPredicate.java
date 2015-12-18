package lists;

public interface FilterPredicate<T> {
	
	boolean matches(T anObject);

}

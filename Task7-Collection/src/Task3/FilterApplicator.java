package Task3;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class FilterApplicator<T> {

    public static void filter(Collection collection, Filter filter)
    {
        filter.filter(collection);
    }

    public static <T extends Comparable> Collection sort(Collection<T> collection)
    {
        return new TreeSet<>(collection);
    }
}

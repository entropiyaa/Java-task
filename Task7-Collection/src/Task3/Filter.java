package Task3;

import java.util.Collection;
import java.util.Iterator;

public class Filter {

    // удаляет первый элемент коллекции
    public void filter(Collection collection)
    {
        if(!collection.isEmpty())
        {
            Iterator iterator = collection.iterator();
            Object elem = iterator.next();
            collection.remove(elem);
        }
    }
}

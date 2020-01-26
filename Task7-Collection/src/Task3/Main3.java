package Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < 10; i++)
        {
            arrayList.add(i);
        }
        FilterApplicator.filter(arrayList, new Filter());
        for(Integer elem : arrayList) {
            System.out.println(elem);
        }

        List<Number> numberCollection = new ArrayList<>();
        numberCollection.add(new Number(1));
        numberCollection.add(new Number(7));
        numberCollection.add(new Number(2));

        Collection<Number> c = FilterApplicator.sort(numberCollection);
        for(Number elem : c)
        {
            System.out.println(elem);
        }
    }
}
